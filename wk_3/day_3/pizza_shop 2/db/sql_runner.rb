require('pg')
class SqlRunner

  def self.run(sql, values = []) #values has a default because not all sql queries have a condition/argument
    begin #begin and ensure are there to make sure that no matter what happens the db closes (if it errored out and you don't do this the connection would remain open and eventually fall over

    #everything that could go wrong should be in begin
    db = PG.connect ({dbname: "pizza_shop", host: "localhost"})

    db.prepare("query", sql)

    results = db.exec_prepared("query", values)
    ensure
      db.close if db != nil
    end
  return results
  end
end
