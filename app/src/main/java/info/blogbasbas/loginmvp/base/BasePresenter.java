package info.blogbasbas.loginmvp.base;

/**
 * Created by User on 22/01/2018.
 */

public interface BasePresenter<T extends MainView> {


    void onAttach(T view);
    void onDetach();



}
