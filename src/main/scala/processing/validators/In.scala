package processing.validators

class In (value: Any, condition: List[Any]) extends Validator {
  override def Validate(): Unit = {
    result = condition.contains(value)
  }
}
