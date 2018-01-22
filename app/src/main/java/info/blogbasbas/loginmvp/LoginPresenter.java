package info.blogbasbas.loginmvp;

import android.widget.EditText;

import info.blogbasbas.loginmvp.base.BasePresenter;

/**
 * Created by User on 22/01/2018.
 */

public class LoginPresenter implements BasePresenter<Viewlogin> {

    Viewlogin model ;
    @Override
    public void onAttach(Viewlogin view) {
        model = view ;
    }



    public void login (EditText email , EditText password ){

        String getemail = email.getText().toString();
        String getpassword = password.getText().toString();

        if(getemail.isEmpty() || getpassword.isEmpty()){
            model.Error();

        }
        else if ( getemail.equals("test") && getpassword.equals("test")){
            model.Success();

        }
        else{
            model.Error();
        }


    }


    @Override
    public void onDetach() {

        model = null;

    }
}
