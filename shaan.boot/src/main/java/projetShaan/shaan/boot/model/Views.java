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

	// -----------------------BONUS PERSONNAGE------------------------
	// ---------------------------------------------------------------

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

	// -----------------------JOUEUR-----------------------------------
	// ----------------------------------------------------------------

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
