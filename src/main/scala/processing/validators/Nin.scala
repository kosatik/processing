package processing.validators

class Nin(value: Any, condition: List[Any]) extends Validator {
  override def Validate(): Unit = {
    result = ! condition.contains(value)
  }
}
