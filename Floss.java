/**
 * An object that abstractly defines a single color of floss which may or may not be
 * present in any particular collection
 */
public class Floss {

    /** DMC floss or from some other company */
    private String manufacturer;

    /** The number for this floss color */
    private int flossNumber;

    /** The specific name of this floss color */
    private String flossName;

    /** Standard, or any type of (DMC) specialty floss */
    private FlossType flossType;

    /** The closest hex color code to this floss color */
    private int hexCode;

    /** The general color category this floss falls into- red, green, purple, etc */
    private ColorCategory color;
}
