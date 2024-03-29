require_relative("../db/sql_runner")

class Casting

    attr_accessor :fee, :movie_id, :star_id
    attr_reader :id


    def initialize(options)

      @id = options["id"].to_i if options["id"]
      @fee = options ["fee"].to_i
      @movie_id = options["movie_id"].to_i
      @star_id = options["star_id"].to_i

    end

    def save()

      sql = "INSERT INTO castings
      (
        fee,
        movie_id,
        star_id
      )
      VALUES
      ($1,$2, $3)
      RETURNING id"
      values = [@fee, @movie_id, @star_id]
      casting = SqlRunner.run( sql, values ).first
      @id = casting['id'].to_i
    end

    def Casting.delete_all
      sql ="DELETE FROM castings"
      SqlRunner.run(sql)
    end

  end
