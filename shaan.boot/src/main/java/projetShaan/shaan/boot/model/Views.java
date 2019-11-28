package projetShaan.shaan.boot.model;


public class Views {
	
	public static class ViewCommon {
	}


	// -----------------------ACQUIS----------------------------------
	// ---------------------------------------------------------------
	public static class ViewAcquis extends ViewCommon{}
	public static class ViewAcquisDetail extends ViewAcquis{}
	
	// -----------------------ALTERATIO NETAT-------------------------
	// ---------------------------------------------------------------
	public static class ViewAlterationEtat extends ViewCommon{}
	public static class ViewAlterationEtatDetail extends ViewAlterationEtat{}
	
	
	// -----------------------ALTERATION PERSONNAGE-------------------
	// ---------------------------------------------------------------
	public static class ViewAlterationPersonnage extends ViewCommon{
	}
	public static class ViewAlterationPersonnageDetail extends ViewAlterationPersonnage{
	}
	// -----------------------BONUS PERSONNAGE------------------------
	// ---------------------------------------------------------------
	public static class ViewBonusPersonnage extends ViewCommon{
	}
	public static class ViewBonusPersonnageDetail extends ViewBonusPersonnage{
	}
	//-----------------------CASTES-----------------------------------
	//----------------------------------------------------------------
	public static class ViewCaste extends ViewCommon {	
	}
	
	public static class ViewCasteDetail extends ViewCaste {	
	}
	
	public static class ViewMetierFromCaste extends ViewCommon {	
	}
	
	// -----------------------DOMAINE---------------------------------
	public static class ViewDomaine extends ViewCommon{
	}
	public static class ViewDomaineDetail extends ViewDomaine{
	}
	// ---------------------------------------------------------------
	// -----------------------DOMAINE PERSONNAGE----------------------
	// ---------------------------------------------------------------
	public static class ViewDomainePersonnage extends ViewCommon{
	}
	public static class ViewDomainePersonnageDetail extends ViewDomainePersonnage{
	}
	// -----------------------JOUEUR-----------------------------------
	// ----------------------------------------------------------------
	public static class ViewJoueur extends ViewCommon{
	}
	public static class ViewJoueurDetail extends ViewJoueur{
	}
	// -----------------------MAITRE DU JEU----------------------------
	// ----------------------------------------------------------------

	// -----------------------METIER-----------------------------------
	// ----------------------------------------------------------------
	
	public static class ViewMetier extends ViewCommon {
	}	
	
	public static class ViewMetierDetail extends ViewMetier {}

	// -----------------------MOTIVATION-------------------------------
	// ----------------------------------------------------------------
	public static class ViewMotivation extends ViewCommon{
	}
	public static class ViewMotivationDetail extends ViewMotivation{
	}
	// -----------------------MOTIVATION PERSONNAGE--------------------
	// ----------------------------------------------------------------
	public static class ViewMotivationPersonnage extends ViewCommon{
	}
	public static class ViewMotivationPersonnageDetail extends ViewMotivationPersonnage{
	}
	// -----------------------PERSONNAGE-------------------------------
	// ----------------------------------------------------------------

	// -----------------------PERSONNAGE NON JOUEUR--------------------
	// ----------------------------------------------------------------

	// ----------------------PEUPLES----------------------------------
	//----------------------------------------------------------------
	public static class ViewPeuple extends ViewCommon {}	
	
	public static class ViewPeupleDetail extends ViewPeuple {}	
	
	// -----------------------POUVOIR----------------------------------
	// ----------------------------------------------------------------

	// -----------------------POUVOIR PERSONNAGE-----------------------
	// ----------------------------------------------------------------
	
	//-----------------------RACES------------------------------------
	public static class ViewRace extends ViewCommon{}
	public static class ViewRaceDetail extends ViewRace{}
	//----------------------------------------------------------------


	// -----------------------SPECIALISATION---------------------------
	// ----------------------------------------------------------------
	public class ViewSpecialisation extends ViewCommon{}
	public class ViewSpecialisationDetail extends ViewSpecialisation{}
	// -----------------------SPECIALISATION ACQUIS--------------------
	// ----------------------------------------------------------------

	// -----------------------TABLE DE JEU-----------------------------
	// ----------------------------------------------------------------

	// -----------------------UTILISATEUR------------------------------
	// ----------------------------------------------------------------

}
