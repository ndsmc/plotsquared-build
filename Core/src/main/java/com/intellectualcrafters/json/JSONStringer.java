package com.intellectualcrafters.json;

import java.io.StringWriter;

/**
 * JSONStringer provides a quick and convenient way of producing JSON text. The texts produced strictly conform to JSON
 * syntax rules. No whitespace is added, so the results are ready for transmission or storage. Each instance of
 * JSONStringer can produce one JSON text.
 * <p>
 * A JSONStringer instance provides a <code>value</code> method for appending values to the text, and a <code>key</code>
 * method for adding keys before values in objects. There are <code>array</code> and <code>endArray</code> methods that
 * make and bound array values, and <code>object</code> and <code>endObject</code> methods which make and bound object
 * values. All of these methods return the JSONWriter instance, permitting cascade style. For example,
 * <p>
 * <p>
 * <pre>
 * myString = new JSONStringer().object().key(&quot;JSON&quot;).value(&quot;Hello,
 * World!&quot;).endObject().toString();
 * </pre>
 * <p>
 * which produces the string
 * <p>
 * <p>
 * <pre>
 * {"JSON":"Hello, World!"}
 * </pre>
 * <p>
 * The first method called must be <code>array</code> or <code>object</code>. There are no methods for adding commas or
 * colons. JSONStringer adds them for you. Objects and arrays can be nested up to 20 levels deep.
 * <p>
 * This can sometimes be easier than using a JSONObject to build a string.
 *
 * @author JSON.org
 * @version 2008-09-18
 */
public class JSONStringer extends JSONWriter {
    /**
     * Make a fresh JSONStringer. It can be used to build one JSON text.
     */
    public JSONStringer() {
        super(new StringWriter());
    }

    /**
     * Return the JSON text. This method is used to obtain the product of the JSONStringer instance. It will return
     * <code>null</code> if there was a problem in the construction of the JSON text (such as the calls to
     * <code>array</code> were not properly balanced with calls to <code>endArray</code>).
     *
     * @return The JSON text.
     */
    @Override public String toString() {
        return mode == 'd' ? writer.toString() : null;
    }
}
