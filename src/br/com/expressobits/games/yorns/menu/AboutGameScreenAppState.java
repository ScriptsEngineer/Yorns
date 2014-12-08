/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.expressobits.games.yorns.menu;

import br.com.expressobits.games.yorns.Main;
import br.com.expressobits.games.yorns.gj.GameJoltAppState;
import static br.com.expressobits.games.yorns.menu.LoginScreenAppState.s;
import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Label;
import de.lessvoid.nifty.controls.TextField;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

/**
 *
 * @author Rafael
 */
public class AboutGameScreenAppState extends AbstractAppState implements ScreenController{
    public SimpleApplication app;
    TextField textfieldNick;
    TextField textfieldPassword;
    static Label labelMessagePopup;
    Element popupElement;
    
    static String s;

    
    
    
    @Override
    public void initialize(AppStateManager stateManager, Application app) {
        super.initialize(stateManager, app); //To change body of generated methods, choose Tools | Templates.
        this.app = (SimpleApplication)app;
        this.app.getGuiViewPort().addProcessor(Main.niftyJmeDisplay);
        Main.nifty.registerScreenController(this);
        Main.nifty.fromXml("Interface/AboutGameScreen.xml", "GScreenAboutGame");
        this.app.getFlyByCamera().setDragToRotate(true);
    }

    @Override
    public void stateDetached(AppStateManager stateManager) {
        super.stateDetached(stateManager); //To change body of generated methods, choose Tools | Templates.
        this.app.getGuiViewPort().removeProcessor(Main.niftyJmeDisplay);
    }
    
    
    public void cancel(){
        app.getStateManager().getState(MenuAppState.class).retornaMenu();
    }

    public void bind(Nifty nifty, Screen screen) {
        System.out.println("bind( " + screen.getScreenId() + ")");
    }

    public void onStartScreen() {
    }

    public void onEndScreen() {
    }
}
