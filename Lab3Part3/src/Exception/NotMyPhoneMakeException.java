package Exception;

class NotMyPhoneMakeException extends Exception
{
      //Parameterless Constructor
      public NotMyPhoneMakeException() {}

      //Constructor that accepts a message
      public NotMyPhoneMakeException(String message)
      {
         super(message);
      }
 }