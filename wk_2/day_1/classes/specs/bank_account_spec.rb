require('minitest/autorun')
#require('minitest/rg')

require_relative('../bank_account')

class Test_Bank_Account < Minitest::Test

  def setup
  @bank_account = BankAccount.new("Colin", 500, "personal")
  @bank_account2 = BankAccount.new("work", 50000, "business")

  end

    def test_account_name
      @bank_account.holder_name = "colin"
      result = @bank_account.holder_name
      assert_equal("colin", result)
    end

    def test_get_balance
      @bank_account.balance = 500
      result = @bank_account.balance
      assert_equal(500, result)
    end

      def test_get_account_type
        @bank_account.type = "personal"
        result = @bank_account.type
        assert_equal("personal", result)
      end

    def test_set_account_name
      @bank_account.holder_name = "steve"
      result = @bank_account.holder_name
      assert_equal("steve", result)
    end

    def test_set_account_balance
      @bank_account.balance = 1000
      result = @bank_account.balance
      assert_equal(1000, result)
    end

    def test_set_type
      @bank_account.type = "business"
      result = @bank_account.type
      assert_equal("business", result)
    end

    def test_pay_into_account
      @bank_account.pay_in(10000)
      assert_equal(10500, @bank_account.balance)
    end

    def test_pay_monthly_fee__personal

      @bank_account.pay_monthly_fee
      assert_equal(490, @bank_account.balance)
    end

    def test_pay_monthly_fee__business

      @bank_account2.pay_monthly_fee
      assert_equal(49950, @bank_account2.balance)
    end

end
