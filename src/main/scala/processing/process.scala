package processing

import processing.entities.{PriceInfo, ProductEntity, RuleEntity}

class process (products: List[ProductEntity]) {
  private var rules: List[RuleEntity] = List()

  def GetPriceInformation (): List[PriceInfo] = {
    prepare
    process(products)
  }

  private def prepare: Unit = {
    loadRules
  }

  private def loadRules: Unit = {
    val a = new RuleEntity
    rules = List(a)
  }

  private def process(products: List[ProductEntity]): List[PriceInfo] = {
    List(new PriceInfo)
  }
}
