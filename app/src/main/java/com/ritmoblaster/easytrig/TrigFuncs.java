package com.ritmoblaster.easytrig;

class TrigFuncs {

  public static void main(String args[]) {

    // System.out.println(Math.cos(getFuncArgIndexAsDouble(PLUS_FRAC_PI_6)));
    // if (Math.cos(getFuncArgIndexAsDouble(PLUS_FRAC_PI_4)) == Math.sqrt(2.0d)/2.0d)
    // System.out.println("foo!");

  }

  // Retrieve drawable resource corresponding to function name index.

  static int getFuncNameDrawableResource(int funcNameIndex) {

    switch (funcNameIndex) {

      case FUNC_NAME_SIN:

        return R.drawable.funcname_sin;

      case FUNC_NAME_COS:

        return R.drawable.funcname_cos;

      case FUNC_NAME_TAN:

        return R.drawable.funcname_tan;

      case FUNC_NAME_SEC:

        return R.drawable.funcname_sec;

      case FUNC_NAME_CSC:

        return R.drawable.funcname_csc;

      case FUNC_NAME_COT:

        return R.drawable.funcname_cos;

    }

    // should never get here

    return 0;

  }

  // Retrieve drawable resource corresponding to function name index.

  static int getFuncNameDefDrawableResource(int funcNameIndex) {

    switch (funcNameIndex) {

      case FUNC_NAME_SIN:

        return R.drawable.funcnamedef_sin;

      case FUNC_NAME_COS:

        return R.drawable.funcnamedef_cos;

      case FUNC_NAME_TAN:

        return R.drawable.funcnamedef_tan;

      case FUNC_NAME_SEC:

        return R.drawable.funcnamedef_sec;

      case FUNC_NAME_CSC:

        return R.drawable.funcnamedef_csc;

      case FUNC_NAME_COT:

        return R.drawable.funcnamedef_cos;

    }

    // should never get here

    return 0;

  }

  // Retrieve drawable resource corresponding to degree argument index.

  static int getFuncArgDegDrawableResource(int funcArgDegIndex) {

    switch (funcArgDegIndex) {

      case FUNC_ARGDEG_ZERO:

        return R.drawable.funcargdeg_zero;

      case FUNC_ARGDEG_PLUS_30:

        return R.drawable.funcargdeg_plus30;

      case FUNC_ARGDEG_MINUS_30:

        return R.drawable.funcargdeg_minus30;

      case FUNC_ARGDEG_PLUS_45:

        return R.drawable.funcargdeg_plus45;

      case FUNC_ARGDEG_MINUS_45:

        return R.drawable.funcargdeg_minus45;

      case FUNC_ARGDEG_PLUS_60:

        return R.drawable.funcargdeg_plus60;

      case FUNC_ARGDEG_MINUS_60:

        return R.drawable.funcargdeg_minus60;

      case FUNC_ARGDEG_PLUS_90:

        return R.drawable.funcargdeg_plus90;

      case FUNC_ARGDEG_MINUS_90:

        return R.drawable.funcargdeg_minus90;

      case FUNC_ARGDEG_PLUS_120:

        return R.drawable.funcargdeg_plus120;

      case FUNC_ARGDEG_MINUS_120:

        return R.drawable.funcargdeg_minus120;

      case FUNC_ARGDEG_PLUS_135:

        return R.drawable.funcargdeg_plus135;

      case FUNC_ARGDEG_MINUS_135:

        return R.drawable.funcargdeg_minus135;

      case FUNC_ARGDEG_PLUS_150:

        return R.drawable.funcargdeg_plus150;

      case FUNC_ARGDEG_MINUS_150:

        return R.drawable.funcargdeg_minus150;

      case FUNC_ARGDEG_PLUS_180:

        return R.drawable.funcargdeg_plus180;

      case FUNC_ARGDEG_MINUS_180:

        return R.drawable.funcargdeg_minus180;

      case FUNC_ARGDEG_PLUS_210:

        return R.drawable.funcargdeg_plus210;

      case FUNC_ARGDEG_MINUS_210:

        return R.drawable.funcargdeg_minus210;

      case FUNC_ARGDEG_PLUS_225:

        return R.drawable.funcargdeg_plus225;

      case FUNC_ARGDEG_MINUS_225:

        return R.drawable.funcargdeg_minus225;

      case FUNC_ARGDEG_PLUS_240:

        return R.drawable.funcargdeg_plus240;

      case FUNC_ARGDEG_MINUS_240:

        return R.drawable.funcargdeg_minus240;

      case FUNC_ARGDEG_PLUS_270:

        return R.drawable.funcargdeg_plus270;

      case FUNC_ARGDEG_MINUS_270:

        return R.drawable.funcargdeg_minus270;

      case FUNC_ARGDEG_PLUS_300:

        return R.drawable.funcargdeg_plus300;

      case FUNC_ARGDEG_MINUS_300:

        return R.drawable.funcargdeg_minus300;

      case FUNC_ARGDEG_PLUS_315:

        return R.drawable.funcargdeg_plus315;

      case FUNC_ARGDEG_MINUS_315:

        return R.drawable.funcargdeg_minus315;

      case FUNC_ARGDEG_PLUS_330:

        return R.drawable.funcargdeg_plus330;

      case FUNC_ARGDEG_MINUS_330:

        return R.drawable.funcargdeg_minus330;

      case FUNC_ARGDEG_PLUS_360:

        return R.drawable.funcargdeg_plus360;

      case FUNC_ARGDEG_MINUS_360:

        return R.drawable.funcargdeg_minus360;

    }

    // should never get here

    return 0;

  }

  // Retrieve drawable resource corresponding to radian argument index.

  static int getFuncArgRadDrawableResource(int funcArgRadIndex) {

    switch (funcArgRadIndex) {

      case FUNC_ARGRAD_ZERO:

        return R.drawable.funcargrad_zero;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return R.drawable.funcargrad_plus_frac_pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return R.drawable.funcargrad_minus_frac_pi_6;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return R.drawable.funcargrad_plus_frac_pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return R.drawable.funcargrad_minus_frac_pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return R.drawable.funcargrad_plus_frac_pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return R.drawable.funcargrad_minus_frac_pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return R.drawable.funcargrad_plus_frac_pi_2;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return R.drawable.funcargrad_minus_frac_pi_2;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return R.drawable.funcargrad_plus_frac_2pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return R.drawable.funcargrad_minus_frac_2pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return R.drawable.funcargrad_plus_frac_3pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return R.drawable.funcargrad_minus_frac_3pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return R.drawable.funcargrad_plus_frac_5pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return R.drawable.funcargrad_minus_frac_5pi_6;

      case FUNC_ARGRAD_PLUS_PI:

        return R.drawable.funcargrad_plus_pi;

      case FUNC_ARGRAD_MINUS_PI:

        return R.drawable.funcargrad_minus_pi;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return R.drawable.funcargrad_plus_frac_7pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return R.drawable.funcargrad_minus_frac_7pi_6;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return R.drawable.funcargrad_plus_frac_5pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return R.drawable.funcargrad_minus_frac_5pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return R.drawable.funcargrad_plus_frac_4pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return R.drawable.funcargrad_minus_frac_4pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return R.drawable.funcargrad_plus_frac_3pi_2;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return R.drawable.funcargrad_minus_frac_3pi_2;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return R.drawable.funcargrad_plus_frac_5pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return R.drawable.funcargrad_minus_frac_5pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return R.drawable.funcargrad_plus_frac_7pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return R.drawable.funcargrad_minus_frac_7pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return R.drawable.funcargrad_plus_frac_11pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return R.drawable.funcargrad_minus_frac_11pi_6;

      case FUNC_ARGRAD_PLUS_2PI:

        return R.drawable.funcargrad_plus_2pi;

      case FUNC_ARGRAD_MINUS_2PI:

        return R.drawable.funcargrad_minus_2pi;

    }

    // should never get here

    return 0;

  }

  // Retrieve small drawable resource corresponding to degree argument index.

  static int getFuncArgDegSmallDrawableResource(int funcArgDegIndex) {

    switch (funcArgDegIndex) {

      case FUNC_ARGDEG_ZERO:

        return R.drawable.funcargdegsmall_zero;

      case FUNC_ARGDEG_PLUS_30:

        return R.drawable.funcargdegsmall_plus30;

      case FUNC_ARGDEG_MINUS_30:

        return R.drawable.funcargdegsmall_minus30;

      case FUNC_ARGDEG_PLUS_45:

        return R.drawable.funcargdegsmall_plus45;

      case FUNC_ARGDEG_MINUS_45:

        return R.drawable.funcargdegsmall_minus45;

      case FUNC_ARGDEG_PLUS_60:

        return R.drawable.funcargdegsmall_plus60;

      case FUNC_ARGDEG_MINUS_60:

        return R.drawable.funcargdegsmall_minus60;

      case FUNC_ARGDEG_PLUS_90:

        return R.drawable.funcargdegsmall_plus90;

      case FUNC_ARGDEG_MINUS_90:

        return R.drawable.funcargdegsmall_minus90;

      case FUNC_ARGDEG_PLUS_120:

        return R.drawable.funcargdegsmall_plus120;

      case FUNC_ARGDEG_MINUS_120:

        return R.drawable.funcargdegsmall_minus120;

      case FUNC_ARGDEG_PLUS_135:

        return R.drawable.funcargdegsmall_plus135;

      case FUNC_ARGDEG_MINUS_135:

        return R.drawable.funcargdegsmall_minus135;

      case FUNC_ARGDEG_PLUS_150:

        return R.drawable.funcargdegsmall_plus150;

      case FUNC_ARGDEG_MINUS_150:

        return R.drawable.funcargdegsmall_minus150;

      case FUNC_ARGDEG_PLUS_180:

        return R.drawable.funcargdegsmall_plus180;

      case FUNC_ARGDEG_MINUS_180:

        return R.drawable.funcargdegsmall_minus180;

      case FUNC_ARGDEG_PLUS_210:

        return R.drawable.funcargdegsmall_plus210;

      case FUNC_ARGDEG_MINUS_210:

        return R.drawable.funcargdegsmall_minus210;

      case FUNC_ARGDEG_PLUS_225:

        return R.drawable.funcargdegsmall_plus225;

      case FUNC_ARGDEG_MINUS_225:

        return R.drawable.funcargdegsmall_minus225;

      case FUNC_ARGDEG_PLUS_240:

        return R.drawable.funcargdegsmall_plus240;

      case FUNC_ARGDEG_MINUS_240:

        return R.drawable.funcargdegsmall_minus240;

      case FUNC_ARGDEG_PLUS_270:

        return R.drawable.funcargdegsmall_plus270;

      case FUNC_ARGDEG_MINUS_270:

        return R.drawable.funcargdegsmall_minus270;

      case FUNC_ARGDEG_PLUS_300:

        return R.drawable.funcargdegsmall_plus300;

      case FUNC_ARGDEG_MINUS_300:

        return R.drawable.funcargdegsmall_minus300;

      case FUNC_ARGDEG_PLUS_315:

        return R.drawable.funcargdegsmall_plus315;

      case FUNC_ARGDEG_MINUS_315:

        return R.drawable.funcargdegsmall_minus315;

      case FUNC_ARGDEG_PLUS_330:

        return R.drawable.funcargdegsmall_plus330;

      case FUNC_ARGDEG_MINUS_330:

        return R.drawable.funcargdegsmall_minus330;

      case FUNC_ARGDEG_PLUS_360:

        return R.drawable.funcargdegsmall_plus360;

      case FUNC_ARGDEG_MINUS_360:

        return R.drawable.funcargdegsmall_minus360;

    }

    // should never get here

    return 0;

  }

  // Retrieve small drawable resource corresponding to radian argument index.

  static int getFuncArgRadSmallDrawableResource(int funcArgRadIndex) {

    switch (funcArgRadIndex) {

      case FUNC_ARGRAD_ZERO:

        return R.drawable.funcargradsmall_zero;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return R.drawable.funcargradsmall_plus_frac_pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return R.drawable.funcargradsmall_minus_frac_pi_6;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return R.drawable.funcargradsmall_plus_frac_pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return R.drawable.funcargradsmall_minus_frac_pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return R.drawable.funcargradsmall_plus_frac_pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return R.drawable.funcargradsmall_minus_frac_pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return R.drawable.funcargradsmall_plus_frac_pi_2;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return R.drawable.funcargradsmall_minus_frac_pi_2;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return R.drawable.funcargradsmall_plus_frac_2pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return R.drawable.funcargradsmall_minus_frac_2pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return R.drawable.funcargradsmall_plus_frac_3pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return R.drawable.funcargradsmall_minus_frac_3pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return R.drawable.funcargradsmall_plus_frac_5pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return R.drawable.funcargradsmall_minus_frac_5pi_6;

      case FUNC_ARGRAD_PLUS_PI:

        return R.drawable.funcargradsmall_plus_pi;

      case FUNC_ARGRAD_MINUS_PI:

        return R.drawable.funcargradsmall_minus_pi;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return R.drawable.funcargradsmall_plus_frac_7pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return R.drawable.funcargradsmall_minus_frac_7pi_6;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return R.drawable.funcargradsmall_plus_frac_5pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return R.drawable.funcargradsmall_minus_frac_5pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return R.drawable.funcargradsmall_plus_frac_4pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return R.drawable.funcargradsmall_minus_frac_4pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return R.drawable.funcargradsmall_plus_frac_3pi_2;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return R.drawable.funcargradsmall_minus_frac_3pi_2;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return R.drawable.funcargradsmall_plus_frac_5pi_3;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return R.drawable.funcargradsmall_minus_frac_5pi_3;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return R.drawable.funcargradsmall_plus_frac_7pi_4;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return R.drawable.funcargradsmall_minus_frac_7pi_4;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return R.drawable.funcargradsmall_plus_frac_11pi_6;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return R.drawable.funcargradsmall_minus_frac_11pi_6;

      case FUNC_ARGRAD_PLUS_2PI:

        return R.drawable.funcargradsmall_plus_2pi;

      case FUNC_ARGRAD_MINUS_2PI:

        return R.drawable.funcargradsmall_minus_2pi;

    }

    // should never get here

    return 0;

  }

  // Retrieve drawable resource corresponding to function value index.

  static int getFuncValDrawableResource(int funcValIndex) {

    switch (funcValIndex) {

      case FUNC_VAL_ZERO:

        return R.drawable.funcval_zero_selector;

      case FUNC_VAL_PLUS_FRAC_1_2:

        return R.drawable.funcval_plus_frac_1_2_selector;

      case FUNC_VAL_MINUS_FRAC_1_2:

        return R.drawable.funcval_minus_frac_1_2_selector;

      case FUNC_VAL_PLUS_FRAC_SQRT3_3:

        return R.drawable.funcval_plus_frac_sqrt3_3_selector;

      case FUNC_VAL_MINUS_FRAC_SQRT3_3:

        return R.drawable.funcval_minus_frac_sqrt3_3_selector;

      case FUNC_VAL_PLUS_FRAC_SQRT2_2:

        return R.drawable.funcval_plus_frac_sqrt2_2_selector;

      case FUNC_VAL_MINUS_FRAC_SQRT2_2:

        return R.drawable.funcval_minus_frac_sqrt2_2_selector;

      case FUNC_VAL_PLUS_FRAC_SQRT3_2:

        return R.drawable.funcval_plus_frac_sqrt3_2_selector;

      case FUNC_VAL_MINUS_FRAC_SQRT3_2:

        return R.drawable.funcval_minus_frac_sqrt3_2_selector;

      case FUNC_VAL_PLUS_1:

        return R.drawable.funcval_plus_1_selector;

      case FUNC_VAL_MINUS_1:

        return R.drawable.funcval_minus_1_selector;

      case FUNC_VAL_PLUS_FRAC_2SQRT3_3:

        return R.drawable.funcval_plus_frac_2sqrt3_3_selector;

      case FUNC_VAL_MINUS_FRAC_2SQRT3_3:

        return R.drawable.funcval_minus_frac_2sqrt3_3_selector;

      case FUNC_VAL_PLUS_SQRT2:

        return R.drawable.funcval_plus_sqrt2_selector;

      case FUNC_VAL_MINUS_SQRT2:

        return R.drawable.funcval_minus_sqrt2_selector;

      case FUNC_VAL_PLUS_SQRT3:

        return R.drawable.funcval_plus_sqrt3_selector;

      case FUNC_VAL_MINUS_SQRT3:

        return R.drawable.funcval_minus_sqrt3_selector;

      case FUNC_VAL_PLUS_2:

        return R.drawable.funcval_plus_2_selector;

      case FUNC_VAL_MINUS_2:

        return R.drawable.funcval_minus_2_selector;

      case FUNC_VAL_UNDEFINED:

        return R.drawable.funcval_undefined_selector;

    }

    // should never get here

    return 0;

  }

  // Retrieve resource corresponding to triangle hypotenuse.

  static int getHypotenuseAsDrawableResource(int triangleType) {

    switch (triangleType) {

      case TRIANGLE_TYPE_DEGENERATE:

        return R.drawable.sidedef_hyp_1;

      case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

        return R.drawable.sidedef_hyp_1;

      case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

        return R.drawable.sidedef_hyp_2;

      case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

        return R.drawable.sidedef_hyp_frac_2sqrt3_3;

      case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

        return R.drawable.sidedef_hyp_2sqrt3;

      case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

        return R.drawable.sidedef_hyp_1;

      case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

        return R.drawable.sidedef_hyp_sqrt2;

      case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

        return R.drawable.sidedef_hyp_2;

    }

    // should never get here

    return 0;

  }

  // Retrieve double value corresponding to side opposite 30 degree angle.

  static int getPositiveSideOpposite30DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_adj_plus_frac_1_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_adj_plus_1;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_adj_plus_frac_sqrt3_3;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_adj_plus_sqrt3;

        }

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_opp_plus_frac_1_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_opp_plus_1;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_opp_plus_frac_sqrt3_3;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_opp_plus_sqrt3;

        }

    }

    // should never get here

    return 0;

  }

  static int getNegativeSideOpposite30DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_adj_minus_frac_1_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_adj_minus_1;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_adj_minus_frac_sqrt3_3;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_adj_minus_sqrt3;

        }

        break;

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_opp_minus_frac_1_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_opp_minus_1;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_opp_minus_frac_sqrt3_3;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_opp_minus_sqrt3;

        }

        break;

    }
    // should never get here

    return 0;

  }

  // Retrieve double value corresponding to side opposite 60 degree angle.

  static int getPositiveSideOpposite60DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_adj_plus_frac_sqrt3_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_adj_plus_sqrt3;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_adj_plus_1;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_adj_plus_3;

        }

        break;

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_opp_plus_frac_sqrt3_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_opp_plus_sqrt3;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_opp_plus_1;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_opp_plus_3;

        }

        break;

    }

    // should never get here

    return 0;

  }

  static int getNegativeSideOpposite60DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_adj_minus_frac_sqrt3_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_adj_minus_sqrt3;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_adj_minus_1;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_adj_minus_3;

        }

        break;

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

            return R.drawable.sidedef_opp_minus_frac_sqrt3_2;

          case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

            return R.drawable.sidedef_opp_minus_sqrt3;

          case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

            return R.drawable.sidedef_opp_minus_1;

          case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

            return R.drawable.sidedef_opp_minus_3;

        }

        break;

    }

    // should never get here

    return 0;

  }

  // Retrieve double value corresponding to side opposite 45 degree angle.

  static int getPositiveSideOpposite45DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

            return R.drawable.sidedef_adj_plus_frac_sqrt2_2;

          case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

            return R.drawable.sidedef_adj_plus_1;

          case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

            return R.drawable.sidedef_adj_plus_2;

        }

        break;

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

            return R.drawable.sidedef_opp_plus_frac_sqrt2_2;

          case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

            return R.drawable.sidedef_opp_plus_1;

          case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

            return R.drawable.sidedef_opp_plus_2;

        }

        break;

    }
    // should never get here

    return 0;

  }

  static int getNegativeSideOpposite45DegreeAngleAsDrawableResource(int triangleType, int sideType) {

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        switch (triangleType) {

          case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

            return R.drawable.sidedef_adj_minus_frac_sqrt2_2;

          case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

            return R.drawable.sidedef_adj_minus_1;

          case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

            return R.drawable.sidedef_adj_minus_2;

        }

      case SIDE_TYPE_OPPOSITE:

        switch (triangleType) {

          case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

            return R.drawable.sidedef_opp_minus_frac_sqrt2_2;

          case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

            return R.drawable.sidedef_opp_minus_1;

          case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

            return R.drawable.sidedef_opp_minus_2;

        }

    }
    // should never get here

    return 0;

  }

  // Retrieve side equation for specified triangle side type and function argument index.

  static int getTriangleSideEquationDrawableResource(int sideType, int funcArgIndex) {

    int triangleType = getTriangleType(funcArgIndex);

    switch (sideType) {

      case SIDE_TYPE_ADJACENT:

        double adjValue = getHypotenuseAsDouble(triangleType) * Math.cos(getFuncArgIndexAsDouble(funcArgIndex));

        if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(adjValue, getHypotenuseAsDouble(triangleType)))

          return R.drawable.sidedef_adj_plus_1;

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(adjValue, getSideOpposite60DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite60DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo454590Triangle(funcArgIndex) && isWithinEpsilon(adjValue, getSideOpposite45DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite45DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(adjValue, getSideOpposite30DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite30DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(adjValue, 0.0d))

          return R.drawable.sidedef_adj_zero;

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(adjValue, -getSideOpposite30DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite30DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo454590Triangle(funcArgIndex) && isWithinEpsilon(adjValue, -getSideOpposite45DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite45DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(adjValue, -getSideOpposite60DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite60DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(adjValue, -getHypotenuseAsDouble(triangleType)))

          return R.drawable.sidedef_adj_minus_1;

        break;

      case SIDE_TYPE_OPPOSITE:

        double oppValue = getHypotenuseAsDouble(triangleType) * Math.sin(getFuncArgIndexAsDouble(funcArgIndex));

        if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(oppValue, getHypotenuseAsDouble(triangleType)))

          return R.drawable.sidedef_opp_plus_1;

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(oppValue, getSideOpposite60DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite60DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo454590Triangle(funcArgIndex) && isWithinEpsilon(oppValue, getSideOpposite45DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite45DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(oppValue, getSideOpposite30DegreeAngleAsDouble(triangleType)))

          return getPositiveSideOpposite30DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(oppValue, 0.0d))

          return R.drawable.sidedef_opp_zero;

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(oppValue, -getSideOpposite30DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite30DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo454590Triangle(funcArgIndex) && isWithinEpsilon(oppValue, -getSideOpposite45DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite45DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsTo306090Triangle(funcArgIndex) && isWithinEpsilon(oppValue, -getSideOpposite60DegreeAngleAsDouble(triangleType)))

          return getNegativeSideOpposite60DegreeAngleAsDrawableResource(triangleType, sideType);

        else if (correspondsToDegenerateTriangle(funcArgIndex) && isWithinEpsilon(oppValue, -getHypotenuseAsDouble(triangleType)))

          return R.drawable.sidedef_opp_minus_1;

        break;

      case SIDE_TYPE_HYPOTENUSE:

        return getHypotenuseAsDrawableResource(triangleType);

    }

    System.out.println("Unfortunately got here.");

    // should never get here

    return -1;

  }

  // Retrieve double value corresponding to triangle hypotenuse.

  static double getHypotenuseAsDouble(int triangleType) {

    switch (triangleType) {

      case TRIANGLE_TYPE_DEGENERATE:

        return 1.0;

      case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

        return 1.0;

      case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

        return 2.0;

      case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

        return 2.0 * Math.sqrt(3.0) / 3.0;

      case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

        return 2.0 * Math.sqrt(3.0);

      case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

        return 1.0;

      case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

        return Math.sqrt(2.0);

      case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

        return 2.0;

    }

    // should never get here

    return 0.0;

  }

  // Retrieve double value corresponding to side opposite 30 degree angle.

  static double getSideOpposite30DegreeAngleAsDouble(int triangleType) {

    switch (triangleType) {

      case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

        return 1.0 / 2.0;

      case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

        return 1.0;

      case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

        return Math.sqrt(3.0) / 3.0;

      case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

        return Math.sqrt(3.0);

    }

    // should never get here

    return 0.0;

  }

  // Retrieve double value corresponding to side opposite 60 degree angle.

  static double getSideOpposite60DegreeAngleAsDouble(int triangleType) {

    switch (triangleType) {

      case TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1:

        return Math.sqrt(3.0) / 2.0;

      case TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2:

        return Math.sqrt(3.0);

      case TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3:

        return 1.0;

      case TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3:

        return 3.0;

    }

    // should never get here

    return 0.0;

  }

  // Retrieve double value corresponding to side opposite 45 degree angle.

  static double getSideOpposite45DegreeAngleAsDouble(int triangleType) {

    switch (triangleType) {

      case TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1:

        return Math.sqrt(2.0) / 2.0;

      case TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2:

        return 1.0;

      case TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2:

        return Math.sqrt(2.0);

    }

    // should never get here

    return 0.0;

  }

  // Check whether function argument index corresponds to 30-60-90 triangle.

  static boolean correspondsTo306090Triangle(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return true;

      case FUNC_ARGRAD_PLUS_PI:

        return false;

      case FUNC_ARGRAD_MINUS_PI:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return true;

      case FUNC_ARGRAD_PLUS_2PI:

        return false;

      case FUNC_ARGRAD_MINUS_2PI:

        return false;

    }

    // should never get here

    return false;

  }

  // Check whether function argument index corresponds to 45-45-90 triangle.

  static boolean correspondsTo454590Triangle(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_PI:

        return false;

      case FUNC_ARGRAD_MINUS_PI:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_2PI:

        return false;

      case FUNC_ARGRAD_MINUS_2PI:

        return false;

    }

    // should never get here

    return false;

  }

  // Check whether function argument index corresponds to degenerate triangle.

  static boolean correspondsToDegenerateTriangle(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_PI:

        return true;

      case FUNC_ARGRAD_MINUS_PI:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return true;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return true;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return false;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return false;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return false;

      case FUNC_ARGRAD_PLUS_2PI:

        return true;

      case FUNC_ARGRAD_MINUS_2PI:

        return true;

    }

    // should never get here

    return false;

  }

  // Retrieve triangle type corresponding to function argument index according to user settings.

  static int getTriangleType(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_PI:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_MINUS_PI:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return triangleType454590;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return triangleType306090;

      case FUNC_ARGRAD_PLUS_2PI:

        return TRIANGLE_TYPE_DEGENERATE;

      case FUNC_ARGRAD_MINUS_2PI:

        return TRIANGLE_TYPE_DEGENERATE;

    }

    // should never get here

    return -1;

  }
  
  // Retrieve numerator side type corresponding to function name.
  
  static int getNumeratorSideTypeForFuncName(int funcNameIndex) {

    switch (funcNameIndex) {

      case FUNC_NAME_SIN:

        return SIDE_TYPE_OPPOSITE;

      case FUNC_NAME_COS:

        return SIDE_TYPE_ADJACENT;

      case FUNC_NAME_TAN:

        return SIDE_TYPE_OPPOSITE;

      case FUNC_NAME_SEC:

        return SIDE_TYPE_HYPOTENUSE;

      case FUNC_NAME_CSC:

        return SIDE_TYPE_HYPOTENUSE;

      case FUNC_NAME_COT:

        return SIDE_TYPE_ADJACENT;

    }

    // should never get here

    return -1;

  }
  
  // Retrieve denominator side type corresponding to function name.
  
  static int getDenominatorSideTypeForFuncName(int funcNameIndex) {

    switch (funcNameIndex) {

      case FUNC_NAME_SIN:

        return SIDE_TYPE_HYPOTENUSE;

      case FUNC_NAME_COS:

        return SIDE_TYPE_HYPOTENUSE;

      case FUNC_NAME_TAN:

        return SIDE_TYPE_ADJACENT;

      case FUNC_NAME_SEC:

        return SIDE_TYPE_ADJACENT;

      case FUNC_NAME_CSC:

        return SIDE_TYPE_OPPOSITE;

      case FUNC_NAME_COT:

        return SIDE_TYPE_OPPOSITE;

    }

    // should never get here

    return -1;

  }

  // Convert function degree argument index to integer.
  /*
   * static double getFuncArgDegIndexAsInteger(int funcArgDegIndex) {
   * 
   * switch (funcArgDegIndex) {
   * 
   * case FUNC_ARGDEG_ZERO:
   * 
   * return 0;
   * 
   * case FUNC_ARGDEG_PLUS_30:
   * 
   * return 30;
   * 
   * case FUNC_ARGDEG_MINUS_30:
   * 
   * return -30;
   * 
   * case FUNC_ARGDEG_PLUS_45:
   * 
   * return 45;
   * 
   * case FUNC_ARGDEG_MINUS_45:
   * 
   * return -45;
   * 
   * case FUNC_ARGDEG_PLUS_60:
   * 
   * return 60;
   * 
   * case FUNC_ARGDEG_MINUS_60:
   * 
   * return -60;
   * 
   * case FUNC_ARGDEG_PLUS_90:
   * 
   * return 90;
   * 
   * case FUNC_ARGDEG_MINUS_90:
   * 
   * return -90;
   * 
   * case FUNC_ARGDEG_PLUS_120:
   * 
   * return 120;
   * 
   * case FUNC_ARGDEG_MINUS_120:
   * 
   * return -120;
   * 
   * case FUNC_ARGDEG_PLUS_135:
   * 
   * return 135;
   * 
   * case FUNC_ARGDEG_MINUS_135:
   * 
   * return -135;
   * 
   * case FUNC_ARGDEG_PLUS_150:
   * 
   * return 150;
   * 
   * case FUNC_ARGDEG_MINUS_150:
   * 
   * return -150;
   * 
   * case FUNC_ARGDEG_PLUS_180:
   * 
   * return 180;
   * 
   * case FUNC_ARGDEG_MINUS_180:
   * 
   * return -180;
   * 
   * case FUNC_ARGDEG_PLUS_210:
   * 
   * return 210;
   * 
   * case FUNC_ARGDEG_MINUS_210:
   * 
   * return -210;
   * 
   * case FUNC_ARGDEG_PLUS_225:
   * 
   * return 225;
   * 
   * case FUNC_ARGDEG_MINUS_225:
   * 
   * return -225;
   * 
   * case FUNC_ARGDEG_PLUS_240:
   * 
   * return 240;
   * 
   * case FUNC_ARGDEG_MINUS_240:
   * 
   * return -240;
   * 
   * case FUNC_ARGDEG_PLUS_270:
   * 
   * return 270;
   * 
   * case FUNC_ARGDEG_MINUS_270:
   * 
   * return -270;
   * 
   * case FUNC_ARGDEG_PLUS_300:
   * 
   * return 300;
   * 
   * case FUNC_ARGDEG_MINUS_300:
   * 
   * return -300;
   * 
   * case FUNC_ARGDEG_PLUS_315:
   * 
   * return 315;
   * 
   * case FUNC_ARGDEG_MINUS_315:
   * 
   * return -315;
   * 
   * case FUNC_ARGDEG_PLUS_330:
   * 
   * return 330;
   * 
   * case FUNC_ARGDEG_MINUS_330:
   * 
   * return -330;
   * 
   * case FUNC_ARGDEG_PLUS_360:
   * 
   * return 360;
   * 
   * case FUNC_ARGDEG_MINUS_360:
   * 
   * return -360;
   * 
   * }
   * 
   * // should never get here
   * 
   * return 0;
   * 
   * }
   */

  // Return function value index corresponding to specified function name index and argument index.

  static int evalAsIndex(int funcNameIndex, int funcArgIndex) {

    switch (funcNameIndex) {

      case FUNC_NAME_SIN:

        return getFuncValDoubleAsIndex(Math.sin(getFuncArgIndexAsDouble(funcArgIndex)));

      case FUNC_NAME_COS:

        return getFuncValDoubleAsIndex(Math.cos(getFuncArgIndexAsDouble(funcArgIndex)));

      case FUNC_NAME_TAN:

        return getFuncValDoubleAsIndex(Math.tan(getFuncArgIndexAsDouble(funcArgIndex)));

      case FUNC_NAME_SEC:

        if (Math.cos(getFuncArgIndexAsDouble(funcArgIndex)) != 0.0)

          return getFuncValDoubleAsIndex(1.0d / Math.cos(getFuncArgIndexAsDouble(funcArgIndex)));

        return FUNC_VAL_UNDEFINED;

      case FUNC_NAME_CSC:

        if (Math.sin(getFuncArgIndexAsDouble(funcArgIndex)) != 0.0)

          return getFuncValDoubleAsIndex(1.0d / Math.sin(getFuncArgIndexAsDouble(funcArgIndex)));

        return FUNC_VAL_UNDEFINED;

      case FUNC_NAME_COT:

        if (Math.tan(getFuncArgIndexAsDouble(funcArgIndex)) != 0.0)

          return getFuncValDoubleAsIndex(1.0d / Math.tan(getFuncArgIndexAsDouble(funcArgIndex)));

        return FUNC_VAL_UNDEFINED;

    }

    // should never get here

    return 0;

  }

  // Convert function degree or radian argument index to double.

  static double getFuncArgIndexAsDouble(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return 0.0d;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return Math.PI / 6.0d;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return -Math.PI / 6.0d;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return Math.PI / 4.0d;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return -Math.PI / 4.0d;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return Math.PI / 3.0d;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return -Math.PI / 3.0d;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return Math.PI / 2.0d;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return -Math.PI / 2.0d;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return 2.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return -2.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return 3.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return -3.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return 5.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return -5.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_PLUS_PI:

        return Math.PI;

      case FUNC_ARGRAD_MINUS_PI:

        return -Math.PI;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return 7.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return -7.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return 5.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return -5.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return 4.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return -4.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return 3.0d * Math.PI / 2.0d;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return -3.0d * Math.PI / 2.0d;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return 5.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return -5.0d * Math.PI / 3.0d;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return 7.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return -7.0d * Math.PI / 4.0d;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return 11.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return -11.0d * Math.PI / 6.0d;

      case FUNC_ARGRAD_PLUS_2PI:

        return 2.0d * Math.PI;

      case FUNC_ARGRAD_MINUS_2PI:

        return -2.0d * Math.PI;

    }

    // should never get here

    return 0;

  }

  // Convert function degree argument index to double.

  static int getFuncArgDoubleAsIndex(double funcArgDouble) {

    if (funcArgDouble == 0.0d)

      return FUNC_ARGRAD_ZERO;

    if (funcArgDouble == Math.PI / 6.0d)

      return FUNC_ARGRAD_PLUS_FRAC_PI_6;

    if (funcArgDouble == -Math.PI / 6.0d)

      return FUNC_ARGRAD_MINUS_FRAC_PI_6;

    if (funcArgDouble == Math.PI / 4.0d)

      return FUNC_ARGRAD_PLUS_FRAC_PI_4;

    if (funcArgDouble == -Math.PI / 4.0d)

      return FUNC_ARGRAD_MINUS_FRAC_PI_4;

    if (funcArgDouble == Math.PI / 3.0d)

      return FUNC_ARGRAD_PLUS_FRAC_PI_3;

    if (funcArgDouble == -Math.PI / 3.0d)

      return FUNC_ARGRAD_MINUS_FRAC_PI_3;

    if (funcArgDouble == Math.PI / 2.0d)

      return FUNC_ARGRAD_PLUS_FRAC_PI_2;

    if (funcArgDouble == -Math.PI / 2.0d)

      return FUNC_ARGRAD_MINUS_FRAC_PI_2;

    if (funcArgDouble == 2.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_PLUS_FRAC_2PI_3;

    if (funcArgDouble == -2.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_MINUS_FRAC_2PI_3;

    if (funcArgDouble == 3.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_PLUS_FRAC_3PI_4;

    if (funcArgDouble == -3.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_MINUS_FRAC_3PI_4;

    if (funcArgDouble == 5.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_PLUS_FRAC_5PI_6;

    if (funcArgDouble == -5.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_MINUS_FRAC_5PI_6;

    if (funcArgDouble == Math.PI)

      return FUNC_ARGRAD_PLUS_PI;

    if (funcArgDouble == -Math.PI)

      return FUNC_ARGRAD_MINUS_PI;

    if (funcArgDouble == 7.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_PLUS_FRAC_7PI_6;

    if (funcArgDouble == -7.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_MINUS_FRAC_7PI_6;

    if (funcArgDouble == 5.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_PLUS_FRAC_5PI_4;

    if (funcArgDouble == 5.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_MINUS_FRAC_5PI_4;

    if (funcArgDouble == 4.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_PLUS_FRAC_4PI_3;

    if (funcArgDouble == -4.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_MINUS_FRAC_4PI_3;

    if (funcArgDouble == 3.0d * Math.PI / 2.0d)

      return FUNC_ARGRAD_PLUS_FRAC_3PI_2;

    if (funcArgDouble == -3.0d * Math.PI / 2.0d)

      return FUNC_ARGRAD_MINUS_FRAC_3PI_2;

    if (funcArgDouble == 5.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_PLUS_FRAC_5PI_3;

    if (funcArgDouble == -5.0d * Math.PI / 3.0d)

      return FUNC_ARGRAD_MINUS_FRAC_5PI_3;

    if (funcArgDouble == 7.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_PLUS_FRAC_7PI_4;

    if (funcArgDouble == -7.0d * Math.PI / 4.0d)

      return FUNC_ARGRAD_MINUS_FRAC_7PI_4;

    if (funcArgDouble == 11.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_PLUS_FRAC_11PI_6;

    if (funcArgDouble == -11.0d * Math.PI / 6.0d)

      return FUNC_ARGRAD_MINUS_FRAC_11PI_6;

    if (funcArgDouble == 2.0d * Math.PI)

      return FUNC_ARGRAD_PLUS_2PI;

    if (funcArgDouble == -2.0d * Math.PI)

      return FUNC_ARGRAD_MINUS_2PI;

    // should never get here

    return -1;

  }

  static int getFuncValDoubleAsIndex(double funcValDouble) {

    System.out.println("funcValDouble: " + funcValDouble);

    if (isWithinEpsilon(funcValDouble, 0.0))

      return FUNC_VAL_ZERO;

    else if (isWithinEpsilon(funcValDouble, 1.0 / 2.0))

      return FUNC_VAL_PLUS_FRAC_1_2;

    else if (isWithinEpsilon(funcValDouble, -1.0 / 2.0))

      return FUNC_VAL_MINUS_FRAC_1_2;

    else if (isWithinEpsilon(funcValDouble, Math.sqrt(3.0) / 3.0))

      return FUNC_VAL_PLUS_FRAC_SQRT3_3;

    else if (isWithinEpsilon(funcValDouble, -Math.sqrt(3.0) / 3.0))

      return FUNC_VAL_MINUS_FRAC_SQRT3_3;

    else if (isWithinEpsilon(funcValDouble, Math.sqrt(2.0) / 2.0))

      return FUNC_VAL_PLUS_FRAC_SQRT2_2;

    else if (isWithinEpsilon(funcValDouble, -Math.sqrt(2.0) / 2.0))

      return FUNC_VAL_MINUS_FRAC_SQRT2_2;

    else if (isWithinEpsilon(funcValDouble, Math.sqrt(3.0) / 2.0))

      return FUNC_VAL_PLUS_FRAC_SQRT3_2;

    else if (isWithinEpsilon(funcValDouble, -Math.sqrt(3.0) / 2.0))

      return FUNC_VAL_MINUS_FRAC_SQRT3_2;

    else if (isWithinEpsilon(funcValDouble, 1.0))

      return FUNC_VAL_PLUS_1;

    else if (isWithinEpsilon(funcValDouble, -1.0))

      return FUNC_VAL_MINUS_1;

    else if (isWithinEpsilon(funcValDouble, 2.0 * Math.sqrt(3.0) / 3.0))

      return FUNC_VAL_PLUS_FRAC_2SQRT3_3;

    else if (isWithinEpsilon(funcValDouble, -2.0 * Math.sqrt(3.0) / 3.0))

      return FUNC_VAL_MINUS_FRAC_2SQRT3_3;

    else if (isWithinEpsilon(funcValDouble, Math.sqrt(2.0)))

      return FUNC_VAL_PLUS_SQRT2;

    else if (isWithinEpsilon(funcValDouble, -Math.sqrt(2.0)))

      return FUNC_VAL_MINUS_SQRT2;

    else if (isWithinEpsilon(funcValDouble, Math.sqrt(3.0)))

      return FUNC_VAL_PLUS_SQRT3;

    else if (isWithinEpsilon(funcValDouble, -Math.sqrt(3.0)))

      return FUNC_VAL_MINUS_SQRT3;

    else if (isWithinEpsilon(funcValDouble, 2.0))

      return FUNC_VAL_PLUS_2;

    else if (isWithinEpsilon(funcValDouble, -2.0))

      return FUNC_VAL_MINUS_2;

    else

      // should never get here

      return FUNC_VAL_UNDEFINED;

  }

  static boolean isWithinEpsilon(double val1, double val2) {

    return Math.abs(val1 - val2) < epsilon;

  }

  static int getRotationAngleIndexFromFuncArgIndex(int funcArgIndex) {

    switch (funcArgIndex) {

      case FUNC_ARGRAD_ZERO:

        return 0;

      case FUNC_ARGRAD_PLUS_FRAC_PI_6:

        return 1;

      case FUNC_ARGRAD_MINUS_FRAC_PI_6:

        return rotation_angles.length - 1;

      case FUNC_ARGRAD_PLUS_FRAC_PI_4:

        return 2;

      case FUNC_ARGRAD_MINUS_FRAC_PI_4:

        return rotation_angles.length - 2;

      case FUNC_ARGRAD_PLUS_FRAC_PI_3:

        return 3;

      case FUNC_ARGRAD_MINUS_FRAC_PI_3:

        return rotation_angles.length - 3;

      case FUNC_ARGRAD_PLUS_FRAC_PI_2:

        return 4;

      case FUNC_ARGRAD_MINUS_FRAC_PI_2:

        return rotation_angles.length - 4;

      case FUNC_ARGRAD_PLUS_FRAC_2PI_3:

        return 5;

      case FUNC_ARGRAD_MINUS_FRAC_2PI_3:

        return rotation_angles.length - 5;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_4:

        return 6;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_4:

        return rotation_angles.length - 6;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_6:

        return 7;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_6:

        return rotation_angles.length - 7;

      case FUNC_ARGRAD_PLUS_PI:

        return 8;

      case FUNC_ARGRAD_MINUS_PI:

        return rotation_angles.length - 8;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_6:

        return 9;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_6:

        return rotation_angles.length - 9;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_4:

        return 10;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_4:

        return rotation_angles.length - 10;

      case FUNC_ARGRAD_PLUS_FRAC_4PI_3:

        return 11;

      case FUNC_ARGRAD_MINUS_FRAC_4PI_3:

        return rotation_angles.length - 11;

      case FUNC_ARGRAD_PLUS_FRAC_3PI_2:

        return 12;

      case FUNC_ARGRAD_MINUS_FRAC_3PI_2:

        return rotation_angles.length - 12;

      case FUNC_ARGRAD_PLUS_FRAC_5PI_3:

        return 13;

      case FUNC_ARGRAD_MINUS_FRAC_5PI_3:

        return rotation_angles.length - 13;

      case FUNC_ARGRAD_PLUS_FRAC_7PI_4:

        return 14;

      case FUNC_ARGRAD_MINUS_FRAC_7PI_4:

        return rotation_angles.length - 14;

      case FUNC_ARGRAD_PLUS_FRAC_11PI_6:

        return 15;

      case FUNC_ARGRAD_MINUS_FRAC_11PI_6:

        return rotation_angles.length - 15;

      case FUNC_ARGRAD_PLUS_2PI:

        return 0;

      case FUNC_ARGRAD_MINUS_2PI:

        return 0;

    }

    // should never get here

    return -1;

  }

  // Trigonometric function names.

  static final int FUNC_NAME_SIN = 0;
  static final int FUNC_NAME_COS = 1;
  static final int FUNC_NAME_TAN = 2;
  static final int FUNC_NAME_SEC = 3;
  static final int FUNC_NAME_CSC = 4;
  static final int FUNC_NAME_COT = 5;

  static final int NUM_FUNC_NAMES = 6;

  // Degree angles coinciding with radian angles to be used as trigonometric function arguments.

  static final int FUNC_ARGDEG_ZERO = 0;
  static final int FUNC_ARGDEG_PLUS_30 = 1;
  static final int FUNC_ARGDEG_MINUS_30 = 2;
  static final int FUNC_ARGDEG_PLUS_45 = 3;
  static final int FUNC_ARGDEG_MINUS_45 = 4;
  static final int FUNC_ARGDEG_PLUS_60 = 5;
  static final int FUNC_ARGDEG_MINUS_60 = 6;
  static final int FUNC_ARGDEG_PLUS_90 = 7;
  static final int FUNC_ARGDEG_MINUS_90 = 8;
  static final int FUNC_ARGDEG_PLUS_120 = 9;
  static final int FUNC_ARGDEG_MINUS_120 = 10;
  static final int FUNC_ARGDEG_PLUS_135 = 11;
  static final int FUNC_ARGDEG_MINUS_135 = 12;
  static final int FUNC_ARGDEG_PLUS_150 = 13;
  static final int FUNC_ARGDEG_MINUS_150 = 14;
  static final int FUNC_ARGDEG_PLUS_180 = 15;
  static final int FUNC_ARGDEG_MINUS_180 = 16;
  static final int FUNC_ARGDEG_PLUS_210 = 17;
  static final int FUNC_ARGDEG_MINUS_210 = 18;
  static final int FUNC_ARGDEG_PLUS_225 = 19;
  static final int FUNC_ARGDEG_MINUS_225 = 20;
  static final int FUNC_ARGDEG_PLUS_240 = 21;
  static final int FUNC_ARGDEG_MINUS_240 = 22;
  static final int FUNC_ARGDEG_PLUS_270 = 23;
  static final int FUNC_ARGDEG_MINUS_270 = 24;
  static final int FUNC_ARGDEG_PLUS_300 = 25;
  static final int FUNC_ARGDEG_MINUS_300 = 26;
  static final int FUNC_ARGDEG_PLUS_315 = 27;
  static final int FUNC_ARGDEG_MINUS_315 = 28;
  static final int FUNC_ARGDEG_PLUS_330 = 29;
  static final int FUNC_ARGDEG_MINUS_330 = 30;
  static final int FUNC_ARGDEG_PLUS_360 = 31;
  static final int FUNC_ARGDEG_MINUS_360 = 32;

  // Radian angles coinciding with degree angles to be used as trigonometric function arguments.

  static final int FUNC_ARGRAD_ZERO = 0;
  static final int FUNC_ARGRAD_PLUS_FRAC_PI_6 = 1;
  static final int FUNC_ARGRAD_MINUS_FRAC_PI_6 = 2;
  static final int FUNC_ARGRAD_PLUS_FRAC_PI_4 = 3;
  static final int FUNC_ARGRAD_MINUS_FRAC_PI_4 = 4;
  static final int FUNC_ARGRAD_PLUS_FRAC_PI_3 = 5;
  static final int FUNC_ARGRAD_MINUS_FRAC_PI_3 = 6;
  static final int FUNC_ARGRAD_PLUS_FRAC_PI_2 = 7;
  static final int FUNC_ARGRAD_MINUS_FRAC_PI_2 = 8;
  static final int FUNC_ARGRAD_PLUS_FRAC_2PI_3 = 9;
  static final int FUNC_ARGRAD_MINUS_FRAC_2PI_3 = 10;
  static final int FUNC_ARGRAD_PLUS_FRAC_3PI_4 = 11;
  static final int FUNC_ARGRAD_MINUS_FRAC_3PI_4 = 12;
  static final int FUNC_ARGRAD_PLUS_FRAC_5PI_6 = 13;
  static final int FUNC_ARGRAD_MINUS_FRAC_5PI_6 = 14;
  static final int FUNC_ARGRAD_PLUS_PI = 15;
  static final int FUNC_ARGRAD_MINUS_PI = 16;
  static final int FUNC_ARGRAD_PLUS_FRAC_7PI_6 = 17;
  static final int FUNC_ARGRAD_MINUS_FRAC_7PI_6 = 18;
  static final int FUNC_ARGRAD_PLUS_FRAC_5PI_4 = 19;
  static final int FUNC_ARGRAD_MINUS_FRAC_5PI_4 = 20;
  static final int FUNC_ARGRAD_PLUS_FRAC_4PI_3 = 21;
  static final int FUNC_ARGRAD_MINUS_FRAC_4PI_3 = 22;
  static final int FUNC_ARGRAD_PLUS_FRAC_3PI_2 = 23;
  static final int FUNC_ARGRAD_MINUS_FRAC_3PI_2 = 24;
  static final int FUNC_ARGRAD_PLUS_FRAC_5PI_3 = 25;
  static final int FUNC_ARGRAD_MINUS_FRAC_5PI_3 = 26;
  static final int FUNC_ARGRAD_PLUS_FRAC_7PI_4 = 27;
  static final int FUNC_ARGRAD_MINUS_FRAC_7PI_4 = 28;
  static final int FUNC_ARGRAD_PLUS_FRAC_11PI_6 = 29;
  static final int FUNC_ARGRAD_MINUS_FRAC_11PI_6 = 30;
  static final int FUNC_ARGRAD_PLUS_2PI = 31;
  static final int FUNC_ARGRAD_MINUS_2PI = 32;

  // Number of function arguments.

  static final int NUM_FUNC_ARGS = 33;

  // Fractions to be used as trigonometric function values.

  static final int FUNC_VAL_ZERO = 0;
  static final int FUNC_VAL_PLUS_FRAC_1_2 = 1;
  static final int FUNC_VAL_MINUS_FRAC_1_2 = 2;
  static final int FUNC_VAL_PLUS_FRAC_SQRT3_3 = 3;
  static final int FUNC_VAL_MINUS_FRAC_SQRT3_3 = 4;
  static final int FUNC_VAL_PLUS_FRAC_SQRT2_2 = 5;
  static final int FUNC_VAL_MINUS_FRAC_SQRT2_2 = 6;
  static final int FUNC_VAL_PLUS_FRAC_SQRT3_2 = 7;
  static final int FUNC_VAL_MINUS_FRAC_SQRT3_2 = 8;
  static final int FUNC_VAL_PLUS_1 = 9;
  static final int FUNC_VAL_MINUS_1 = 10;
  static final int FUNC_VAL_PLUS_FRAC_2SQRT3_3 = 11;
  static final int FUNC_VAL_MINUS_FRAC_2SQRT3_3 = 12;
  static final int FUNC_VAL_PLUS_SQRT2 = 13;
  static final int FUNC_VAL_MINUS_SQRT2 = 14;
  static final int FUNC_VAL_PLUS_SQRT3 = 15;
  static final int FUNC_VAL_MINUS_SQRT3 = 16;
  static final int FUNC_VAL_PLUS_2 = 17;
  static final int FUNC_VAL_MINUS_2 = 18;
  static final int FUNC_VAL_UNDEFINED = 19;

  // Number of function values.

  static final int NUM_FUNC_VALS = 20;

  // Epsilon value used to see whether two functions are equal.

  static final double epsilon = 0.001;

  // Rotation angles used to compute rotation angle index and draw on canvas.

  static final float rotation_angles[] = {
      0.0f, 30.0f, 45.0f, 60.0f, 90.0f, 120.0f, 135.0f, 150.0f, 180.0f,
      210.0f, 225.0f, 240.0f, 270.0f, 300.0f, 315.0f, 330.0f };

  // Triangle types used across application.

  static final int TRIANGLE_TYPE_DEGENERATE = 0;

  static final int TRIANGLE_TYPE306090_SIDE_FRAC_1_2_SIDE_FRAC_SQRT3_2_SIDE_1 = 1;

  static final int TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2 = 2;

  static final int TRIANGLE_TYPE306090_SIDE_FRAC_SQRT3_3_SIDE_1_SIDE_FRAC_2SQRT3_3 = 3;

  static final int TRIANGLE_TYPE306090_SIDE_SQRT3_SIDE_3_SIDE_2SQRT3 = 4;

  static final int TRIANGLE_TYPE454590_SIDE_FRAC_SQRT2_2_SIDE_1 = 5;

  static final int TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2 = 6;

  static final int TRIANGLE_TYPE454590_SIDE_SQRT2_SIDE_2 = 7;

  // Triangle type for 30-60-90 triangle as set by user in user preferences.

  static int triangleType306090 = TRIANGLE_TYPE306090_SIDE_1_SIDE_SQRT3_SIDE_2;

  // Triangle type for 45-45-90 triangle as set by user in user preferences.

  static int triangleType454590 = TRIANGLE_TYPE454590_SIDE_1_SIDE_SQRT2;

  // Triangle side types.

  static final int SIDE_TYPE_ADJACENT = 0;
  static final int SIDE_TYPE_OPPOSITE = 1;
  static final int SIDE_TYPE_HYPOTENUSE = 2;

}
