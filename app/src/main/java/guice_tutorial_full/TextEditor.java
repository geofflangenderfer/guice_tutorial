package guice_tutorial_full;

import com.google.inject.Inject;

class TextEditor {
   public SpellChecker spellChecker;

   @Inject
   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }

   public void makeSpellCheck(){
      spellChecker.checkSpelling();
   }
}
