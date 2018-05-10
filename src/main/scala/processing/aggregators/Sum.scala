package processing.aggregators

import processing.contracts.Value
import processing.entities.ProductEntity

class Sum (products: List[ProductEntity]) extends Value {
  override def getValue: Int = {
    products.foldLeft(0){(s, p) => s + p.price}
  }
}


