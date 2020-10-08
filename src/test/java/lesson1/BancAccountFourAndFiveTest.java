package lesson1;

import lesson1.TaskFourAndFiveBancAccount.BancAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BancAccountFourAndFiveTest {
        BancAccount bancAccaunt = new BancAccount();

        @Before
        public void setUp () {
            bancAccaunt = new BancAccount(9, 100);
            System.out.print("Номер аккаунта: " + bancAccaunt.getAccountNumber() + "\n");
        }

        @Test
        public void correctAccount () {
            Assert.assertEquals("Номер аккаунта невереный", bancAccaunt.getAccountNumber(), 9);
        }

        @Test
        public void correctDebit () {
            boolean expected = BancAccount.setBalance(BancAccount.credit(), bancAccaunt.getBalance()) > BancAccount.debit();
            Assert.assertTrue("Сумма снятия больше чем остаток на счету!", expected);
        }

    }

