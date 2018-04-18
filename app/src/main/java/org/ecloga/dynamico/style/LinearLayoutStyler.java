package org.ecloga.dynamico.style;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import org.json.JSONObject;

final class LinearLayoutStyler extends DefaultStyler {

    LinearLayoutStyler(ViewFactory factory, Context context) {
        super(factory, context);
    }

    @Override
    public View style(View view, JSONObject attributes) throws Exception {
        super.style(view, attributes);

        LinearLayout linearLayout = (LinearLayout) view;

        if(attributes.has("orientation")) {
            String orientation = attributes.getString("orientation");

            if(orientation.equalsIgnoreCase("vertical")) {
                linearLayout.setOrientation(LinearLayout.VERTICAL);
            }else if(orientation.equalsIgnoreCase("horizontal")) {
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            }
        }

        if(attributes.has("weightSum")) {
            linearLayout.setWeightSum((float) attributes.getDouble("weightSum"));
        }

        if(attributes.has("gravity")) {
            String gravity = attributes.getString("gravity");

            if(gravity.equalsIgnoreCase("start")) {
                linearLayout.setGravity(Gravity.START);
            }else if(gravity.equalsIgnoreCase("top")) {
                linearLayout.setGravity(Gravity.TOP);
            }else if(gravity.equalsIgnoreCase("end")) {
                linearLayout.setGravity(Gravity.END);
            }else if(gravity.equalsIgnoreCase("bottom")) {
                linearLayout.setGravity(Gravity.BOTTOM);
            }else if(gravity.equalsIgnoreCase("center")) {
                linearLayout.setGravity(Gravity.CENTER);
            }else if(gravity.equalsIgnoreCase("center_horizontal")) {
                linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
            }else if(gravity.equalsIgnoreCase("center_vertical")) {
                linearLayout.setGravity(Gravity.CENTER_VERTICAL);
            }
        }

        return linearLayout;
    }
}