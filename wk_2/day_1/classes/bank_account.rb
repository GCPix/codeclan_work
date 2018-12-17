#classes notes:


class BankAccount
#attr_ ca  be used to shortcut gets, sets methods.  you shouldn't add these unless you need them.  if you want people to have both read, write the accessor option allows both.

  #attr_reader :holder_name, :balance, :type #get methods
  #attr_writer :holder_name, :balance, :type # set methods

  attr_accessor :holder_name, :balance, :type

  def initialize(holder_name, balance, type) #every time you call .new on the class it runs this method

    #names in brackets needs to match the right hand side of variables below but the @ and the one on the right don't need to have the same name.

    @holder_name = holder_name
    @balance = balance
    @type = type
  end

# instance variables - only exist if the object of a class exists (aka state) they are defined with an @ sign at the start.
  def pay_in(value)
    @balance += value
  end

  def pay_monthly_fee
    if @type == "personal"
      fee = 10
    else
      fee = 50
    end
    @balance -= fee
  end
end
