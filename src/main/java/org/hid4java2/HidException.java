package org.hid4java2;

/**
 * <p>Caught exception to provide the following to API consumers:</p>
 * <ul>
 * <li>Notification of a serious problem with HID</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class HidException extends Exception
{

  /**
	 * 
	 */
	private static final long serialVersionUID = -5827925519716407706L;

public HidException(String message) {
    super(message);
  }

  public HidException(String message, Throwable cause) {
    super(message, cause);
  }
}
