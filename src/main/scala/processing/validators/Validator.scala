package processing.validators

abstract class Validator {
  protected var result = false

  def IsValid: Boolean = {
     result
  }

  def Validate: Unit
}
