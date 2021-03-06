/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ContactType implements org.apache.thrift.TEnum {
  MID(0),
  PHONE(1),
  EMAIL(2),
  USERID(3),
  PROXIMITY(4),
  GROUP(5),
  USER(6),
  QRCODE(7),
  PROMOTION_BOT(8),
  CONTACT_MESSAGE(9),
  FRIEND_REQUEST(10),
  REPAIR(128),
  FACEBOOK(2305),
  SINA(2306),
  RENREN(2307),
  FEIXIN(2308),
  BBM(2309),
  BEACON(11);

  private final int value;

  private ContactType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ContactType findByValue(int value) { 
    switch (value) {
      case 0:
        return MID;
      case 1:
        return PHONE;
      case 2:
        return EMAIL;
      case 3:
        return USERID;
      case 4:
        return PROXIMITY;
      case 5:
        return GROUP;
      case 6:
        return USER;
      case 7:
        return QRCODE;
      case 8:
        return PROMOTION_BOT;
      case 9:
        return CONTACT_MESSAGE;
      case 10:
        return FRIEND_REQUEST;
      case 128:
        return REPAIR;
      case 2305:
        return FACEBOOK;
      case 2306:
        return SINA;
      case 2307:
        return RENREN;
      case 2308:
        return FEIXIN;
      case 2309:
        return BBM;
      case 11:
        return BEACON;
      default:
        return null;
    }
  }
}
