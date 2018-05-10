package processing.aggregators

import processing.contracts.Value
import processing.entities.ProductEntity

class Count(products: List[ProductEntity]) extends Value {
  override def getValue: Int = {
    products.size
  }
}


