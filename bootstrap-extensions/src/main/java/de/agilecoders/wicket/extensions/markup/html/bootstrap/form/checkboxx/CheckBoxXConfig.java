package de.agilecoders.wicket.extensions.markup.html.bootstrap.form.checkboxx;

import de.agilecoders.wicket.jquery.AbstractConfig;
import de.agilecoders.wicket.jquery.IKey;

import org.apache.wicket.util.lang.Args;

/**
 * Configuration object for the settings of
 * <a href="https://github.com/kartik-v/bootstrap-checkbox-x">Checkbox X</a>
 */
public class CheckBoxXConfig extends AbstractConfig {

    public enum Sizes {
        xl, lg, md, sm, xs
    }

    /**
     * A flag whether to use three states for the checkbox. This will allow you to save null values,
     * in addition to the built in true and false values. Defaults to true. If set to false, it will allow only the default two values: true and false.
     */
    private static final IKey<Boolean> ThreeState = newKey("threeState", true);

    /**
     * A flag whether the checkboxes are to be styled in an inline-block with other elements placed
     * before or after. Defaults to true. If set to false, checkboxes will be displayed as a block (like in checkbox lists).
     */
    private static final IKey<Boolean> Inline = newKey("inline", true);

    /**
     * The HTML markup for the glyph / icon to be displayed when the checkbox is checked. Defaults to &lt;i class="glyphicon glyphicon-ok"&gt;&lt;/i&gt;
     */
    private static final IKey<String> IconChecked = newKey("iconChecked", "<i class=\"glyphicon glyphicon-ok\"></i>");

    /**
     * The HTML markup for the glyph / icon to be displayed when the checkbox is unchecked. Defaults to a blank character <em> </em>.
     */
    private static final IKey<String> IconUnchecked = newKey("iconUnchecked", " ");

    /**
     * The html markup for the glyph / icon to be displayed when the checkbox is null. Defaults to &lt;i class="glyphicon glyphicon-stop"&gt;&lt;/i&gt;
     */
    private static final IKey<String> IconNull = newKey("iconNull", "<i class=\"glyphicon glyphicon-stop\"></i>");

    /**
     * The size of the checkbox control. Should be one of xl (extra large), lg (large), md (medium), sm (small),
     * or xs (extra small). Defaults to md (medium).
     */
    private static final IKey<Sizes> Size = newKey("size", Sizes.md);

    /**
     * A flag indicating whether clicks on a wrapping &lt;label&gt; should fire change events
     */
    private static final IKey<Boolean> LabelClickEvent = newKey("labelClickEvent", true);

    /**
     * Default constructor
     */
    public CheckBoxXConfig() {
    }

    /**
     * Copy constructor
     *
     * @param copy The
     */
    public CheckBoxXConfig(CheckBoxXConfig copy) {
        Args.notNull(copy, "copy");
        withThreeState(copy.get(ThreeState));
        withLabelClickEvent(copy.get(LabelClickEvent));
        withInline(copy.get(Inline));
        withIconChecked(copy.get(IconChecked));
        withIconUnchecked(copy.get(IconUnchecked));
        withIconNull(copy.get(IconNull));
        withSize(copy.get(Size));
    }

    public CheckBoxXConfig withThreeState(final boolean value) {
        put(ThreeState, value);
        return this;
    }

    public CheckBoxXConfig withLabelClickEvent(final boolean value) {
        put(LabelClickEvent, value);
        return this;
    }

    public CheckBoxXConfig withInline(final boolean value) {
        put(Inline, value);
        return this;
    }

    public CheckBoxXConfig withIconChecked(final String value) {
        put(IconChecked, value);
        return this;
    }

    public CheckBoxXConfig withIconUnchecked(final String value) {
        put(IconUnchecked, value);
        return this;
    }

    public CheckBoxXConfig withIconNull(final String value) {
        put(IconNull, value);
        return this;
    }

    public CheckBoxXConfig withSize(final Sizes value) {
        put(Size, value);
        return this;
    }
}
