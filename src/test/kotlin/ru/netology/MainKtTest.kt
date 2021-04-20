package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun vkPay_amount() {
        val transferMonth  = 0.0
        val itemFeeone = 0.0
        val moneyTransfermaxDay = 1_500_000.0
       val  moneyTransfer = 5_000.0
       val moneyTransfermaxMonth = 4_000_000.0
        val expected = 950.0

        val result = vkPay(
            transferMonth = transferMonth,
            itemFeeone = itemFeeone,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )

        assertEquals(expected, result)
    }
}