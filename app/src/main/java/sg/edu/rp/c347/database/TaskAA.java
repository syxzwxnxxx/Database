package sg.edu.rp.c347.database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017466 on 12/5/2017.
 */

public class TaskAA extends ArrayAdapter<Task> {
    private ArrayList<Task> types;
    private TextView tvID;
    private TextView TVDesc;
    private TextView tvDate;
    private Context context;

    public TaskAA(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        types = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        TVDesc = (TextView) rowView.findViewById(R.id.TVDesc);
        Task currentTask = types.get(position);


        tvID.setText(currentTask.getId() + "");
        TVDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());


        return rowView;
    }

}
