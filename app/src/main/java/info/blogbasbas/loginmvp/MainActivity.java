package info.blogbasbas.loginmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Viewlogin {

    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.Password)
    EditText Password;
    @BindView(R.id.btnSignIn)
    Button btnSignIn;
    LoginPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initPresenter();
            onAttach();
    }
    private void initPresenter() {
        presenter = new LoginPresenter();
    }

    @OnClick(R.id.btnSignIn)
    public void onViewClicked() {

        presenter.login(username,Password);
    }

    @Override
    public void Success() {

        Toast.makeText(this, "berhasil", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Error() {

        Toast.makeText(this, "error ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach() {
        presenter.onAttach(this);

    }

    @Override
    public void onDetach() {
        presenter.onDetach();

    }
}
