package  ru.netology

fun main() {

    val result =vkPay()
    println("$result")

}
fun vkPay(
    transferMonth:Double = 0.0,
    itemFeeone: Double=0.0,
    moneyTransfermaxDay: Double = 1_500_000.0,
    moneyTransfer:Double = 5_000.0,
    moneyTransfermaxMonth: Double =4_000_000.0

){
    val moneyMonth = moneyTransfer+transferMonth
    val amount = moneyTransfer+itemFeeone
    val result = when{
        (moneyTransfer >moneyTransfermaxDay)-> print ("превышен дневной  лимит")
        (moneyMonth>moneyTransfermaxMonth)->print("превышен месячный лимит")
        else-> print (amount)
    }
}
fun visaMir(
    transferMonth:Double = 0.0,
    itemFeetwo: Double=0.75,
    itemPercent: Double = 100.0,
    itemFeemin:Double = 350.0,
    moneyTransfermaxDay: Double = 15_000_000.0,
    moneyTransfer:Double = 5_000_000.0,
    moneyTransfermaxMonth: Double =60_000_000.0
){
val amount = moneyTransfer*itemFeetwo/itemPercent
    val moneyMonth = moneyTransfer + transferMonth
    val result =when{
        moneyTransfer >moneyTransfermaxDay-> print ("превышен дневной  лимит")
        moneyMonth>moneyTransfermaxMonth->print("превышен месячный лимит")
        amount>itemFeemin ->print (moneyTransfer+itemFeemin)
        else->print (amount)
    }
}
fun MastercardMaestro(
    transferMonth:Double = 0.0,
    itemPercent: Double = 100.0,
    itemFeethree: Double= 0.6,
    fixedСonver: Double = 2_000.0,
    moneyTransferperiodOne: Double = 30_000.0,
    moneyTransferperiodTwo:Double = 7_500_000.0,
    moneyTransfermaxDay: Double =  15_000_000.0,
    moneyTransfer:Double = 16_000_000.0,
    moneyTransfermaxMonth: Double =60_000_000.0

){
    val amount = moneyTransfer*itemFeethree/itemPercent+fixedСonver
    val moneyMonth = moneyTransfer + transferMonth
    val result =when{
        moneyTransfer >moneyTransfermaxDay->  print ("превышен дневной  лимит")
        moneyMonth>moneyTransfermaxMonth->print("превышен месячный лимит")
        moneyTransfer >= moneyTransferperiodOne&& moneyTransfer<= moneyTransferperiodTwo ->print (moneyTransfer)
        else -> print (amount)
    }

    
}