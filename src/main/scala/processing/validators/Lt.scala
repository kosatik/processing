package processing.validators

class Lt (value: Int, condition: Int) extends Validator {
  override def Validate(): Unit ={
    result = value < condition
  }
}
