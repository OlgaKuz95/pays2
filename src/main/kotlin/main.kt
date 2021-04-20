package  ru.netology

//fun main() {

  //  val result = vkPay()
   // println(result)

//}

fun vkPay(
    transferMonth: Double = 0.0,
    itemFeeone: Double = 0.0,
    moneyTransfermaxDay: Double = 1_500_000.0,
    moneyTransfer: Double = 5_000.0,
    moneyTransfermaxMonth: Double = 4_000_000.0

): String {
    val moneyMonth = moneyTransfer + transferMonth
    val amount = moneyTransfer + itemFeeone
    return when {
        (moneyTransfer > moneyTransfermaxDay) -> "превышен дневной  лимит"
        (moneyMonth > moneyTransfermaxMonth) -> "превышен месячный лимит"
        else -> amount.toString()
    }
}

fun visaMir(
    transferMonth: Double = 0.0,
    itemFeetwo: Double = 0.75,
    itemPercent: Double = 100.0,
    itemFeemin: Double = 350.0,
    moneyTransfermaxDay: Double = 15_000_000.0,
    moneyTransfer: Double = 5_000_000.0,
    moneyTransfermaxMonth: Double = 60_000_000.0
): String {
    val amount = moneyTransfer * itemFeetwo / itemPercent
    val moneyMonth = moneyTransfer + transferMonth
    return when {
        moneyTransfer > moneyTransfermaxDay -> "превышен дневной  лимит"
        moneyMonth > moneyTransfermaxMonth -> "превышен месячный лимит"
        amount > itemFeemin -> (moneyTransfer + itemFeemin).toString()
        else -> amount.toString()
    }
}

fun mastercardMaestro(
    transferMonth: Double = 0.0,
    itemPercent: Double = 100.0,
    itemFeethree: Double = 0.6,
    fixedConver: Double = 2_000.0,
    moneyTransferperiodOne: Double = 30_000.0,
    moneyTransferperiodTwo: Double = 7_500_000.0,
    moneyTransfermaxDay: Double = 15_000_000.0,
    moneyTransfer: Double = 16_000_000.0,
    moneyTransfermaxMonth: Double = 60_000_000.0

): String {
    val amount = moneyTransfer * itemFeethree / itemPercent + fixedConver
    val moneyMonth = moneyTransfer + transferMonth
    return when {
        moneyTransfer > moneyTransfermaxDay -> "превышен дневной  лимит"
        moneyMonth > moneyTransfermaxMonth -> "превышен месячный лимит"
        moneyTransfer in moneyTransferperiodOne..moneyTransferperiodTwo -> moneyTransfer.toString()
        else -> amount.toString()
    }
}