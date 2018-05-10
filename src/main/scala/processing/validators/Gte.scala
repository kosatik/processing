package processing.validators

class Gte(value: Int, condition: Int) extends Validator {
  override def Validate(): Unit ={
    result = value >= condition
  }
}
