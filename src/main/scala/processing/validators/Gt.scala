package processing.validators

class Gt(value: Int, condition: Int) extends Validator {
  override def Validate(): Unit ={
    result = value > condition
  }
}
