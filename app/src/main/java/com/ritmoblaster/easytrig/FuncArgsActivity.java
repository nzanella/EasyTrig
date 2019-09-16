package com.ritmoblaster.easytrig;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class FuncArgsActivity extends Activity {

  public void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.funcargs);

    ListView funcArgsDegListView = (ListView) findViewById(R.id.funcArgsDegListView);

    ListView funcArgsRadListView = (ListView) findViewById(R.id.funcArgsRadListView);

    funcArgsDegListView.setAdapter(new FuncArgsDegAdapter());

    funcArgsRadListView.setAdapter(new FuncArgsRadAdapter());

  }

  private class FuncArgsDegAdapter extends BaseAdapter {

    @Override
    public int getCount() {

      return TrigFuncs.NUM_FUNC_ARGS;

    }

    @Override
    public long getItemId(int position) {

      return position;

    }

    @Override
    public Integer getItem(int position) {

      return TrigFuncs.getFuncArgDegDrawableResource(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

      LayoutInflater inflater = getLayoutInflater();

      View row = inflater.inflate(R.layout.funcargs_item, parent, false);

      ImageButton funcArgImageButton = (ImageButton) row.findViewById(R.id.funcArgImageButton);

      funcArgImageButton.setImageResource(getItem(position));

      funcArgImageButton.setOnClickListener(new FuncArgDegItemListener(position));

      return row;

    }

  }

  private class FuncArgsRadAdapter extends BaseAdapter {

    @Override
    public int getCount() {

      return TrigFuncs.NUM_FUNC_ARGS;

    }

    @Override
    public long getItemId(int position) {

      return position;

    }

    @Override
    public Integer getItem(int position) {

      return TrigFuncs.getFuncArgRadDrawableResource(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

      LayoutInflater inflater = getLayoutInflater();

      View row = inflater.inflate(R.layout.funcargs_item, parent, false);

      ImageButton funcArgImageButton = (ImageButton) row.findViewById(R.id.funcArgImageButton);

      funcArgImageButton.setImageResource(getItem(position));

      funcArgImageButton.setOnClickListener(new FuncArgRadItemListener(position));

      return row;

    }

  }

  private class FuncArgDegItemListener implements OnClickListener {

    FuncArgDegItemListener(int position) {

      this.position = position;

    }

    @Override
    public void onClick(View v) {

      selectedFuncArgDeg = position;
      selectedFuncArgRad = -1;

      setResult(RESULT_OK);

      finish();

    }

    private int position;

  }

  private class FuncArgRadItemListener implements OnClickListener {

    FuncArgRadItemListener(int position) {

      this.position = position;

    }

    @Override
    public void onClick(View v) {

      selectedFuncArgDeg = -1;
      selectedFuncArgRad = position;

      setResult(RESULT_OK);

      finish();

    }

    private int position;

  }

  public static int selectedFuncArgDeg;
  public static int selectedFuncArgRad;

}
