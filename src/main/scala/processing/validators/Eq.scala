package processing.validators

class Eq(value: Any, condition: Any) extends Validator {
  override def Validate(): Unit = {
    result = value == condition
  }
}
