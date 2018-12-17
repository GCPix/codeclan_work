require_relative("../db/sql_runner")

class Movie

  attr_accessor :title, :genre
  attr_reader :id


  def initialize(options)

    @id = options["id"].to_i if options["id"]
    @title = options["title"]
    @genre = options["genre"]
    @budget = options["budget"]
  end

  def save

    sql = "INSERT INTO movies
    (
      title,
      genre,
      budget
    )
    VALUES
    ($1,$2, $3)
    RETURNING id"
    values = [@title, @genre, @budget]
    movie = SqlRunner.run( sql, values ).first
    @id = movie['id'].to_i
  end

  def Movie.delete_all
    sql ="DELETE FROM movies"
    SqlRunner.run(sql)
  end

  def all_stars()
    # calling everything from stars
    #joinning stars to castings
    # joinning stars to castings based on movie_id
    sql = "SELECT stars.* from stars
    INNER JOIN castings
    ON stars.id = star_id
    WHERE movie_id = $1"
    values = [@id]
    star =SqlRunner.run(sql, values)
    return star.map{|star_data| Star.new(star_data)}
    end

    def budget_tracker
      sql = "SELECT * FROM castings WHERE castings.movie_id = $1" ## I didn't need the cast only the fee for each film so no need to bring any other table back
      values = [@id]
      result = SqlRunner.run(sql, values)
      list = result.map{|cast_list| Casting.new(cast_list)} ## take the  return and map to array
      fee_list = list.map{|cast| cast.fee} # array holds full object, need to on get the fee value (not the hash) it will return an array of just the value
      fee_total = fee_list.sum #sum is used specicially to sum an array
      remaining_budget = @budget - fee_total
    end
  end
