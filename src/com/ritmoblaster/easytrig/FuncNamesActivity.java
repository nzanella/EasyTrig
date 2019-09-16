package com.ritmoblaster.easytrig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class FuncNamesActivity extends Activity implements OnClickListener {

  public void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.funcnames);

    ImageView sinImageView = (ImageView) findViewById(R.id.sinImageView);
    ImageView cosImageView = (ImageView) findViewById(R.id.cosImageView);
    ImageView tanImageView = (ImageView) findViewById(R.id.tanImageView);
    ImageView secImageView = (ImageView) findViewById(R.id.secImageView);
    ImageView cscImageView = (ImageView) findViewById(R.id.cscImageView);
    ImageView cotImageView = (ImageView) findViewById(R.id.cotImageView);

    sinImageView.setOnClickListener(this);
    cosImageView.setOnClickListener(this);
    tanImageView.setOnClickListener(this);
    secImageView.setOnClickListener(this);
    cscImageView.setOnClickListener(this);
    cotImageView.setOnClickListener(this);

  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    // coming back from alarm groups activity

    switch (requestCode) {

      case PICK_FUNCARG_REQUEST:

        if (resultCode == RESULT_OK) {

          setResult(RESULT_OK);
          
          finish();

        }

        break;

    }

  }

  @Override
  public void onClick(View v) {

    switch (v.getId()) {

      case R.id.sinImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_SIN;

        break;

      case R.id.cosImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_COS;

        break;

      case R.id.tanImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_TAN;

        break;

      case R.id.secImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_SEC;

        break;

      case R.id.cscImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_CSC;

        break;

      case R.id.cotImageView:

        selectedFuncName = TrigFuncs.FUNC_NAME_COT;

        break;

    }
    
    startActivityForResult(new Intent(this, FuncArgsActivity.class), PICK_FUNCARG_REQUEST);

  }

  private static final int PICK_FUNCARG_REQUEST = 0;

  public static int selectedFuncName;

}
