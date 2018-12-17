require_relative("../db/sql_runner")


class Star

  attr_accessor :first_name, :last_name
  attr_reader :id

  def self.all_stars
    sql = "SELECT * FROM stars"
    result = SqlRunner.run(sql)
    star_list = result.map{|star_hash| Star.new(star_hash)}
  end

  def Star.delete_all
    sql ="DELETE FROM stars"
    SqlRunner.run(sql)
  end

  def self.find_star(id)
    sql = "SELECT * FROM stars WHERE id = $1"

    values = [id]
    result = SqlRunner.run(sql, values).first
    return Star.new(result)
  end


  def initialize(options)

    @id = options["id"].to_i if options["id"]
    @first_name = options["first_name"]
    @last_name = options["last_name"]
  end

  def save

    sql = "INSERT INTO stars
    (
      first_name,
      last_name
    )
    VALUES
    ($1,$2)
    RETURNING id"
    values = [@first_name, @last_name]
    stars = SqlRunner.run( sql, values ).first
    @id = stars['id'].to_i
  end



  def delete_one
    sql = "DELETE FROM stars WHERE id = $1"

    values = [@id]

    SqlRunner.run(sql, values)
  end

  def all_movies_star()
    sql = "SELECT * FROM movies INNER JOIN castings ON movies.id = castings.movie_id WHERE star_id = $1"

    values = [@id]

    result = SqlRunner.run(sql, values)
    movie_list = result.map{|movie| Movie.new(movie)}
  end

end
