package processing.validators

class Lte(value: Int, condition: Int) extends Validator {
  override def Validate(): Unit ={
    result = value <= condition
  }
}
