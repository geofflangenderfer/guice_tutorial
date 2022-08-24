package guice_tutorial_full;

import com.google.inject.Guice;
import com.google.inject.AbstractModule;

//Binding Module
class TextEditorModule extends AbstractModule {

   @Override
   protected void configure() {
      bind(SpellChecker.class).to(SpellCheckerImpl.class);
   } 
}
