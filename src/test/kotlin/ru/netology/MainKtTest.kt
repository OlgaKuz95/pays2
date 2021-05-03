package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun vkPay() {
        val transferMonth = 0.0
        val itemFeeone = 0.0
        val moneyTransfermaxDay = 1_500_000.0
        val moneyTransfer = 5_000.0
        val moneyTransfermaxMonth = 4_000_000.0
        val expected = 5000.0



        val result = vkPay(
            transferMonth = transferMonth,
            itemFeeone = itemFeeone,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth,

        )

        assertEquals(expected.toString(), result)
    }


    @Test
    fun vkPay_moneyTransfermaxDay() {
        val transferMonth = 0.0
        val itemFeeone = 0.0
        val moneyTransfermaxDay = 1_500_000.0
        val moneyTransfer = 1_500_001.0
        val moneyTransfermaxMonth = 4_000_000.0
        val expected = "превышен дневной  лимит"



        val result = vkPay(
            transferMonth = transferMonth,
            itemFeeone = itemFeeone,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth,

            )

        assertEquals(expected, result)
    }

    @Test
    fun vkPay_moneyTransfermaxMonth() {
        val transferMonth = 4_000_000.0
        val itemFeeone = 0.0
        val moneyTransfermaxDay = 1_500_000.0
        val moneyTransfer = 4_000.0
        val moneyTransfermaxMonth = 4_000_000.0
        val expected = "превышен месячный лимит"



        val result = vkPay(
            transferMonth = transferMonth,
            itemFeeone = itemFeeone,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth,

            )

        assertEquals(expected, result)
    }



    @Test
    fun visaMir() {
        val transferMonth = 0.0
        val itemFeetwo = 0.75
        val itemPercent = 100.0
        val itemFeemin = 350.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 10_000_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = 1.000035E7


        val result = visaMir(
            transferMonth = transferMonth,
            itemFeetwo = itemFeetwo,
            itemPercent = itemPercent,
            itemFeemin = itemFeemin,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected.toString(), result)

    }

    @Test
    fun visaMir_moneyTransfermaxDay() {
        val transferMonth = 0.0
        val itemFeetwo = 0.75
        val itemPercent = 100.0
        val itemFeemin = 350.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 15_070_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected ="превышен дневной  лимит"

        val result = visaMir(
            transferMonth = transferMonth,
            itemFeetwo = itemFeetwo,
            itemPercent = itemPercent,
            itemFeemin = itemFeemin,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected, result)

    }


    @Test
    fun visaMir_transferMonth() {
        val transferMonth = 66_000_000.0
        val itemFeetwo = 0.75
        val itemPercent = 100.0
        val itemFeemin = 350.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 5_000_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = "превышен месячный лимит"

        val result = visaMir(
            transferMonth = transferMonth,
            itemFeetwo = itemFeetwo,
            itemPercent = itemPercent,
            itemFeemin = itemFeemin,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected, result)

    }

    @Test
    fun visaMir_amount() {
        val transferMonth = 0.0
        val itemFeetwo = 0.75
        val itemPercent = 100.0
        val itemFeemin = 350.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 1_000_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = 1_000_350.0

        val result = visaMir(
            transferMonth = transferMonth,
            itemFeetwo = itemFeetwo,
            itemPercent = itemPercent,
            itemFeemin = itemFeemin,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected.toString(), result)

    }

    @Test

    fun  mastercardMaestro(){
        val transferMonth = 0.0
        val itemPercent = 100.0
        val itemFeethree = 0.6
        val fixedConver = 2_000.0
        val moneyTransferperiodOne = 30_000.0
        val moneyTransferperiodTwo = 7_500_000.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 9_000_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected =9_056_000.0


        val result = mastercardMaestro(
            transferMonth = transferMonth,
            itemPercent=itemPercent,
            itemFeethree =itemFeethree,
            fixedConver = fixedConver,
            moneyTransferperiodOne = moneyTransferperiodOne,
            moneyTransferperiodTwo = moneyTransferperiodTwo,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected.toString(), result)

    }

    @Test

    fun  mastercardMaestro_moneyTransfermaxDay(){
        val transferMonth = 0.0
        val itemPercent = 100.0
        val itemFeethree = 0.6
        val fixedConver = 2_000.0
        val moneyTransferperiodOne = 30_000.0
        val moneyTransferperiodTwo = 7_500_000.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 15_600_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = "превышен дневной  лимит"

        val result = mastercardMaestro(
            transferMonth = transferMonth,
            itemPercent=itemPercent,
            itemFeethree =itemFeethree,
            fixedConver = fixedConver,
            moneyTransferperiodOne = moneyTransferperiodOne,
            moneyTransferperiodTwo = moneyTransferperiodTwo,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected, result)

    }

    @Test

    fun  mastercardMaestro_transferMonth(){
        val transferMonth = 66_000_000.0
        val itemPercent = 100.0
        val itemFeethree = 0.6
        val fixedConver = 2_000.0
        val moneyTransferperiodOne = 30_000.0
        val moneyTransferperiodTwo= 7_500_000.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 6_000_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = "превышен месячный лимит"

        val result = mastercardMaestro(
            transferMonth = transferMonth,
            itemPercent=itemPercent,
            itemFeethree =itemFeethree,
            fixedConver = fixedConver,
            moneyTransferperiodOne = moneyTransferperiodOne,
            moneyTransferperiodTwo = moneyTransferperiodTwo,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected, result)

    }

    @Test

    fun  mastercardMaestro_moneyTransferperiod(){
        val transferMonth = 0.0
        val itemPercent = 100.0
        val itemFeethree = 0.6
        val fixedConver = 2_000.0
        val moneyTransferperiodOne = 30_000.0
        val moneyTransferperiodTwo= 7_500_000.0
        val moneyTransfermaxDay = 15_000_000.0
        val moneyTransfer = 30_000.0
        val moneyTransfermaxMonth = 60_000_000.0
        val expected = 30_000.0

        val result = mastercardMaestro(
            transferMonth = transferMonth,
            itemPercent=itemPercent,
            itemFeethree =itemFeethree,
            fixedConver = fixedConver,
            moneyTransferperiodOne = moneyTransferperiodOne,
            moneyTransferperiodTwo = moneyTransferperiodTwo,
            moneyTransfermaxDay = moneyTransfermaxDay,
            moneyTransfer = moneyTransfer,
            moneyTransfermaxMonth = moneyTransfermaxMonth
        )
        assertEquals(expected.toString(), result)

    }
}