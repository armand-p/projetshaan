package projetShaan.shaan.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import projetShaan.shaan.boot.model.PersonnageNonJoueur;
import projetShaan.shaan.boot.model.Joueur;
import projetShaan.shaan.boot.model.MaitreDuJeu;
import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.Acquis;
import projetShaan.shaan.boot.model.AlterationEtat;
import projetShaan.shaan.boot.model.AlterationPersonnage;
import projetShaan.shaan.boot.model.BonusPersonnage;
import projetShaan.shaan.boot.model.Caste;
import projetShaan.shaan.boot.model.Domaine;
import projetShaan.shaan.boot.model.DomainePersonnage;
import projetShaan.shaan.boot.model.Metier;
import projetShaan.shaan.boot.model.Motivation;
import projetShaan.shaan.boot.model.MotivationPersonnage;
import projetShaan.shaan.boot.model.Peuple;
import projetShaan.shaan.boot.model.Pouvoir;
import projetShaan.shaan.boot.model.PouvoirPersonnage;
import projetShaan.shaan.boot.model.Race;
import projetShaan.shaan.boot.model.Specialisation;
import projetShaan.shaan.boot.model.SpecialisationAcquis;
import projetShaan.shaan.boot.model.TableDeJeu;
import projetShaan.shaan.boot.repository.IAcquisRepository;
import projetShaan.shaan.boot.repository.IAlterationEtatRepository;
import projetShaan.shaan.boot.repository.IAlterationPersonnageRepository;
import projetShaan.shaan.boot.repository.IBonusPersonnageRepository;
import projetShaan.shaan.boot.repository.ICasteRepository;
import projetShaan.shaan.boot.repository.IDomainePersonnageRepository;
import projetShaan.shaan.boot.repository.IDomaineRepository;
import projetShaan.shaan.boot.repository.IJoueurRepository;
import projetShaan.shaan.boot.repository.IMaitreDuJeuRepository;
import projetShaan.shaan.boot.repository.IMetierRepository;
import projetShaan.shaan.boot.repository.IMotivationPersonnageRepository;
import projetShaan.shaan.boot.repository.IMotivationRepository;
import projetShaan.shaan.boot.repository.IPersonnageRepository;
import projetShaan.shaan.boot.repository.IPeupleRepository;
import projetShaan.shaan.boot.repository.IPouvoirPersonnageRepository;
import projetShaan.shaan.boot.repository.IPouvoirRepository;
import projetShaan.shaan.boot.repository.IRaceRepository;
import projetShaan.shaan.boot.repository.ISpecialisationAcquisRepository;
import projetShaan.shaan.boot.repository.ISpecialisationRepository;
import projetShaan.shaan.boot.repository.ITableDeJeuRepository;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private IPeupleRepository peupleRepository;
	@Autowired
	private IRaceRepository raceRepository;
	@Autowired
	private IMetierRepository metierRepository;
	@Autowired
	private ICasteRepository casteRepository;
	@Autowired
	private IDomaineRepository domaineRepository;
	@Autowired
	private ISpecialisationRepository specialisationRepository;
	@Autowired
	private IMotivationRepository motivationRepository;
	@Autowired
	private IPouvoirRepository pouvoirRepository;
	@Autowired
	private IAcquisRepository acquisRepository;
	@Autowired
	private ISpecialisationAcquisRepository speAcquisRepository;
	@Autowired
	private IPersonnageRepository personnageRepository; 
	@Autowired
	private IJoueurRepository joueurRepository;
	@Autowired
	private IMaitreDuJeuRepository maitreDuJeuRepository;
	@Autowired
	private ITableDeJeuRepository tableDeJeuRepository;
	@Autowired
	private IAlterationEtatRepository alterationEtatRepository;
	@Autowired
	private IBonusPersonnageRepository bonusPersonnageRepository;
	@Autowired
	private IAlterationPersonnageRepository alterationPersonnageRepository;
	@Autowired
	private IMotivationPersonnageRepository motivationPersonnageRepository;
	@Autowired
	private IPouvoirPersonnageRepository pouvoirPersonnageRepository;
	@Autowired
	private IDomainePersonnageRepository domainePersonnageRepository;
	
	
	@Test
	void contextLoads() {
		

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET DOMAINE
//-------------------------------------------------------------------------------------------------------------------------
		Domaine technique = new Domaine();
		Domaine savoir = new Domaine();
		Domaine social = new Domaine();
		Domaine arts = new Domaine();
		Domaine shaan = new Domaine();
		Domaine magie = new Domaine();
		Domaine rituels = new Domaine();
		Domaine survie = new Domaine();
		Domaine combat = new Domaine();
		Domaine necrose = new Domaine();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	
		Specialisation engrenages = new Specialisation();
		Specialisation pilotage = new Specialisation();
		Specialisation recuperation = new Specialisation();
		Specialisation sensDeLaPierre = new Specialisation();
		Specialisation sensDuBois = new Specialisation();
		Specialisation sensDuCuir = new Specialisation();
		Specialisation sensDuMetal = new Specialisation();
		Specialisation sensDuTissu = new Specialisation();
		Specialisation sensDuVerre = new Specialisation();
		Specialisation technologie = new Specialisation();
		Specialisation alchimie = new Specialisation();
		Specialisation bibliotheque = new Specialisation();
		Specialisation botanique = new Specialisation();
		Specialisation cultureHumaine = new Specialisation();
		Specialisation esoterisme = new Specialisation();
		Specialisation geologie = new Specialisation();
		Specialisation histoireDHeos = new Specialisation();
		Specialisation medecine = new Specialisation();
		Specialisation protocoles = new Specialisation();
		Specialisation zoologie = new Specialisation();
		Specialisation arpege = new Specialisation();
		Specialisation bluff = new Specialisation();
		Specialisation commerce = new Specialisation();
		Specialisation diplomatie = new Specialisation();
		Specialisation enseignement = new Specialisation();
		Specialisation langagePrimal = new Specialisation();
		Specialisation languesExotiques = new Specialisation();
		Specialisation psychologie = new Specialisation();
		Specialisation seduction = new Specialisation();
		Specialisation vieUrbaine = new Specialisation();
		Specialisation artsAppliques = new Specialisation();
		Specialisation artsDuFeu = new Specialisation();
		Specialisation chant = new Specialisation();
		Specialisation comedie = new Specialisation();
		Specialisation deguisement = new Specialisation();
		Specialisation gastronomie = new Specialisation();
		Specialisation langageDuCorps = new Specialisation();
		Specialisation lettres = new Specialisation();
		Specialisation musique = new Specialisation();
		Specialisation trucages = new Specialisation();
		Specialisation embiose = new Specialisation();
		Specialisation empathieAnimale = new Specialisation();
		Specialisation empathieAntheenne = new Specialisation();
		Specialisation empathieMinerale = new Specialisation();
		Specialisation empathieVegetale = new Specialisation();
		Specialisation intuition = new Specialisation();
		Specialisation reve = new Specialisation();
		Specialisation soinsDeLAme = new Specialisation();
		Specialisation soinsDeLEsprit = new Specialisation();
		Specialisation soinsDuCorps = new Specialisation();
		Specialisation arcanes = new Specialisation();
		Specialisation conjuration = new Specialisation();
		Specialisation defenseMagique = new Specialisation();
		Specialisation enchantement = new Specialisation();
		Specialisation incandescence = new Specialisation();
		Specialisation invocation = new Specialisation();
		Specialisation maitriseDesSchemes = new Specialisation();
		Specialisation regeneration = new Specialisation();
		Specialisation transfert = new Specialisation();
		Specialisation voile = new Specialisation();
		Specialisation riteDArts = new Specialisation();
		Specialisation riteDeCombat = new Specialisation();
		Specialisation riteDeLAnimal = new Specialisation();
		Specialisation riteDeMagie = new Specialisation();
		Specialisation riteDeNecrose = new Specialisation();
		Specialisation riteDeSavoir = new Specialisation();
		Specialisation riteDeShaan = new Specialisation();
		Specialisation riteDeSocial = new Specialisation();
		Specialisation riteDeSurvie = new Specialisation();
		Specialisation riteDeTechnique = new Specialisation();
		Specialisation acrobatie = new Specialisation();
		Specialisation caravane = new Specialisation();
		Specialisation cultureHeossienne = new Specialisation();
		Specialisation cultureNecrosienne = new Specialisation();
		Specialisation discretion = new Specialisation();
		Specialisation educationPhysique = new Specialisation();
		Specialisation monture = new Specialisation();
		Specialisation navigation = new Specialisation();
		Specialisation vieSauvage = new Specialisation();
		Specialisation vigilance = new Specialisation();
		Specialisation armesAProjectiles = new Specialisation();
		Specialisation armesDeMelee = new Specialisation();
		Specialisation armesLancees = new Specialisation();
		Specialisation armimales = new Specialisation();
		Specialisation enginsDeGuerre = new Specialisation();
		Specialisation esquive = new Specialisation();
		Specialisation forcer = new Specialisation();
		Specialisation intimidation = new Specialisation();
		Specialisation pugilat = new Specialisation();
		Specialisation strategie = new Specialisation();
		Specialisation armesHumaines = new Specialisation();
		Specialisation biomorphie = new Specialisation();
		Specialisation cauchemar = new Specialisation();
		Specialisation contrebande = new Specialisation();
		Specialisation corruption = new Specialisation();
		Specialisation explosifs = new Specialisation();
		Specialisation fraude = new Specialisation();
		Specialisation harcelement = new Specialisation();
		Specialisation larcin = new Specialisation();
		Specialisation pacteNecrotique = new Specialisation();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET RACE
//-------------------------------------------------------------------------------------------------------------------------	
		Race boreals = new Race();
		Race darkens = new Race();
		Race delhions = new Race();
		Race felings = new Race();
		Race kelwins = new Race();
		Race melodiens = new Race();
		Race nomois = new Race();
		Race woons = new Race();
		Race ygwans = new Race();
		Race humains = new Race();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET PEUPLE
//-------------------------------------------------------------------------------------------------------------------------
		Peuple foretsBlanches = new Peuple();
		Peuple glaces = new Peuple();
		Peuple grandsArbres = new Peuple();
		Peuple hautesHerbes = new Peuple();
		Peuple marais = new Peuple();
		Peuple montagnes = new Peuple();
		Peuple rivages = new Peuple();
		Peuple sables = new Peuple();
		Peuple terresBrulees = new Peuple();
		Peuple cites = new Peuple();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET CASTE
//-------------------------------------------------------------------------------------------------------------------------
		Caste novateurs = new Caste();
		Caste erudits = new Caste();
		Caste negociants = new Caste();
		Caste artistes = new Caste();
		Caste shaanistes = new Caste();
		Caste magiciens = new Caste();
		Caste elementalistes = new Caste();
		Caste voyageurs = new Caste();
		Caste combattants = new Caste();
		Caste ombres = new Caste();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	
		Metier batisseur = new Metier();
		Metier charpentier = new Metier();
		Metier couturier = new Metier();
		Metier forgeron = new Metier();
		Metier infotek = new Metier();
		Metier joaillier = new Metier();
		Metier mecaniste = new Metier();
		Metier pilote = new Metier();
		Metier recuperateur = new Metier();
		Metier tanneur = new Metier();
		Metier alchimiste = new Metier();
		Metier archiviste = new Metier();
		Metier botaniste = new Metier();
		Metier esoteriste = new Metier();
		Metier geologue = new Metier();
		Metier historien = new Metier();
		Metier juriste = new Metier();
		Metier medecin = new Metier();
		Metier percepteur = new Metier();
		Metier zoologue = new Metier();
		Metier courtisan = new Metier();
		Metier cyberien = new Metier();
		Metier diplomate = new Metier();
		Metier enseignant = new Metier();
		Metier informateur = new Metier();
		Metier marchand = new Metier();
		Metier politicien = new Metier();
		Metier prospecteur = new Metier();
		Metier tenancier = new Metier();
		Metier traducteur = new Metier();
		Metier bateleur = new Metier();
		Metier chanteur = new Metier();
		Metier comedien = new Metier();
		Metier costumier = new Metier();
		Metier cuisinier = new Metier();
		Metier danseur = new Metier();
		Metier ecrivain = new Metier();
		Metier evocateur = new Metier();
		Metier musicien = new Metier();
		Metier prestidigitateur = new Metier();
		Metier ameVive = new Metier();
		Metier chasseurDeSteles = new Metier();
		Metier cultivateur = new Metier();
		Metier eleveur = new Metier();
		Metier gardeFou = new Metier();
		Metier marcheurDeReves = new Metier();
		Metier mentaliste = new Metier();
		Metier prescient = new Metier();
		Metier radiant = new Metier();
		Metier telluriste = new Metier();
		Metier arcanien = new Metier();
		Metier conjurateur = new Metier();
		Metier enchanteur = new Metier();
		Metier illusionniste = new Metier();
		Metier mageItinerant = new Metier();
		Metier regenerateur = new Metier();
		Metier revocateur = new Metier();
		Metier shaman = new Metier();
		Metier sorcier = new Metier();
		Metier voleurDeTrihn = new Metier();
		Metier discipleDeLAir = new Metier();
		Metier discipleDeLAnimal = new Metier();
		Metier discipleDeLautre = new Metier();
		Metier discipleDeLEau = new Metier();
		Metier discipleDeLObjet = new Metier();
		Metier discipleDaLaTerre = new Metier();
		Metier discipleDesLimbes = new Metier();
		Metier discipleDuFeu = new Metier();
		Metier discipleDuMoi = new Metier();
		Metier discipleDuVegetal = new Metier();
		Metier athlete = new Metier();
		Metier caravanier = new Metier();
		Metier chasseur = new Metier();
		Metier eclaireur = new Metier();
		Metier espion = new Metier();
		Metier guide = new Metier();
		Metier messager = new Metier();
		Metier navigateur = new Metier();
		Metier traqueurDeStele = new Metier();
		Metier voltigeur = new Metier();
		Metier archer = new Metier();
		Metier armimalier = new Metier();
		Metier artilleur = new Metier();
		Metier fantassin = new Metier();
		Metier francTireur = new Metier();
		Metier gardeMine = new Metier();
		Metier gardienDesForets = new Metier();
		Metier gladiateur = new Metier();
		Metier protecteur = new Metier();
		Metier soldat = new Metier();
		Metier artificier = new Metier();
		Metier ensorceleur = new Metier();
		Metier escroc = new Metier();
		Metier faussaire = new Metier();
		Metier geneticien = new Metier();
		Metier mitrailleur = new Metier();
		Metier necromant = new Metier();
		Metier trafiquant = new Metier();
		Metier voleur = new Metier();
		Metier voyou = new Metier();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		
		Motivation forteresse = new Motivation();
		Motivation palais = new Motivation();
		Motivation machineSousMarine = new Motivation();
		Motivation ouvrage = new Motivation();
		Motivation universite = new Motivation();
		Motivation transmettreSavoir = new Motivation();
		Motivation riche = new Motivation();
		Motivation notable = new Motivation();
		Motivation seduire = new Motivation();
		Motivation charmer = new Motivation();
		Motivation celebre = new Motivation();
		Motivation mode = new Motivation();
		Motivation genereux = new Motivation();
		Motivation trouverAmeSoeur = new Motivation();
		Motivation aider = new Motivation();
		Motivation combattreFailles = new Motivation();
		Motivation enseignerMagie = new Motivation();
		Motivation percerMysteres = new Motivation();
		Motivation communier = new Motivation();
		Motivation progresserDogme = new Motivation();
		Motivation confronterElement = new Motivation();
		Motivation explorer = new Motivation();
		Motivation construireVoyage = new Motivation();
		Motivation nourrir = new Motivation();
		Motivation defierMort = new Motivation();
		Motivation protegerFaibles = new Motivation();
		Motivation venger = new Motivation();
		Motivation peurGens = new Motivation();
		Motivation jouerLoi = new Motivation();
		Motivation venererCapital = new Motivation();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	
		Pouvoir ameliorationDefensive = new Pouvoir();
		Pouvoir ameliorationOffensive = new Pouvoir();
		Pouvoir brisecode = new Pouvoir();
		Pouvoir personnalisationDeVehicule = new Pouvoir();
		Pouvoir clairvoyance = new Pouvoir();
		Pouvoir connaissancePartagee = new Pouvoir();
		Pouvoir apprentissageAccelere = new Pouvoir();
		Pouvoir controleDeLAdministration = new Pouvoir();
		Pouvoir allieProvidentiel = new Pouvoir();
		Pouvoir chanceAuJeu = new Pouvoir();
		Pouvoir achatDuSiecle = new Pouvoir();
		Pouvoir allianceForcee = new Pouvoir();
		Pouvoir chantArcanique = new Pouvoir();
		Pouvoir chantDeBataille = new Pouvoir();
		Pouvoir absurdite = new Pouvoir();
		Pouvoir chantDExaltation = new Pouvoir();
		Pouvoir brulureDAntiAme = new Pouvoir();
		Pouvoir coupDeChance = new Pouvoir();
		Pouvoir agressionPersonnelle = new Pouvoir();
		Pouvoir amitieForcee = new Pouvoir();
		Pouvoir armeMagique = new Pouvoir();
		Pouvoir attaqueTrihnique = new Pouvoir();
		Pouvoir champDeForce = new Pouvoir();
		Pouvoir croissance = new Pouvoir();
		Pouvoir alarmeElementaire = new Pouvoir();
		Pouvoir apaisementElementaire = new Pouvoir();
		Pouvoir blocageElementaire = new Pouvoir();
		Pouvoir bouclierElementaire = new Pouvoir();
		Pouvoir ameDuChasseur = new Pouvoir();
		Pouvoir appelDeLaMonture = new Pouvoir();
		Pouvoir accelererLeVoyage = new Pouvoir();
		Pouvoir appelDeLAnimal = new Pouvoir();
		Pouvoir auraGuerriere = new Pouvoir();
		Pouvoir criDeGuerre = new Pouvoir();
		Pouvoir attaqueTerrifiante = new Pouvoir();
		Pouvoir chargeHeroique = new Pouvoir();
		Pouvoir affaiblissement = new Pouvoir();
		Pouvoir animerLesMorts = new Pouvoir();
		Pouvoir alterationDeSouvenirs = new Pouvoir();
		Pouvoir contagionNovice = new Pouvoir();
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	
		Acquis brevet = new Acquis();
		Acquis lanceClous = new Acquis();
		Acquis herbier = new Acquis();
		Acquis livreDesBetes = new Acquis();
		Acquis trousseDuMenteur = new Acquis();
		Acquis maquillageTribal = new Acquis();
		Acquis feuDArtifice = new Acquis();
		Acquis cachet = new Acquis();
		Acquis pomolhPuant = new Acquis();
		Acquis plantesCuratives = new Acquis();
		Acquis schemeDEnchantementMineur = new Acquis();
		Acquis tuniqueNomoi = new Acquis();
		Acquis grigriDuVegetal = new Acquis();
		Acquis batonWoon = new Acquis();
		Acquis boomerang = new Acquis();
		Acquis longueVue = new Acquis();
		Acquis bolas = new Acquis();
		Acquis sarbacane = new Acquis();
		Acquis armeAFeu = new Acquis();
		Acquis radar = new Acquis();
//*************************************************************************************************************************
//		REMPLISSAGE
//*************************************************************************************************************************

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET DOMAINE
//-------------------------------------------------------------------------------------------------------------------------
		technique.setNom("Technique");
		technique.setElementLie("Objet");
		technique.setDescription(
				"traduit le savoir-faire, l'intelligence de la main et la maitrise de la matière. Monter, démonter pour réinventer et à nouveau construire.");
		technique = domaineRepository.save(technique);

		savoir.setNom("Savoir");
		savoir.setElementLie("Végétal");
		savoir.setDescription("Evoque la soif de connaissance, la mémoire, l'intelect et l'analyse");
		savoir = domaineRepository.save(savoir);

		social.setNom("Social");
		social.setElementLie("Air");
		social.setDescription(
				"Reflète le relationnel avec les autres Anthéens, l'éloquence, l'art d'articuler un discours, la séduction");
		social = domaineRepository.save(social);

		arts.setNom("Arts");
		arts.setElementLie("Autre");
		arts.setDescription("Exprime la firme artistique, la sensualité et la créativité");
		arts = domaineRepository.save(arts);

		shaan.setNom("Shaan");
		shaan.setElementLie("Moi");
		shaan.setDescription(
				"Symbolise l'harmonie avec l'environnement, la magnétisme, la chance brute et la lutte contre les LImbes pour le règne de la paix et de l'équilibre");
		shaan = domaineRepository.save(shaan);

		magie.setNom("Magie");
		magie.setElementLie("Végétal");
		magie.setDescription(
				"Incarne les facultés magiques qui permettent de déceler et contrôler les flux d'énergies Trihnique.");
		magie = domaineRepository.save(magie);

		rituels.setNom("Rituels");
		rituels.setElementLie("Animal");
		rituels.setDescription(
				"Représente la foi dans les Eléments et la capacité à manipuler leur énergie primale pour s'approprier leurs facultés.");
		rituels = domaineRepository.save(rituels);

		survie.setNom("Survie");
		survie.setElementLie("Eau");
		survie.setDescription(
				"Réunit les capacités de déplacement, de perception et d'adaptation à un environnement naturel.");
		survie = domaineRepository.save(survie);

		combat.setNom("Combat");
		combat.setElementLie("Feu");
		combat.setDescription(
				"Utilisé dans toute confrontation physique, tant qu'il s'agit de manier une arme non-humaine.");
		combat = domaineRepository.save(combat);

		necrose.setNom("Necrose");
		necrose.setElementLie("Limbes");
		necrose.setDescription(
				"Personnifie le côté sombre, le chamin parcouru par le personnage sur la voie des Limbes. Il sert à faire beaucoup d'actions peu recommandable et à mesurer son degré de décomposition et l'accumulations de pulsions incontrôlables.");
		necrose = domaineRepository.save(necrose);

//-------------------------------------------------------------------------------------------------------------------------
//				REMPLISSAGE OBJET CASTE
//-------------------------------------------------------------------------------------------------------------------------
		novateurs.setNomCaste("Novateurs");
		novateurs.setDescription(
				"Cette Caste rassemble tous ceux qui travaillent le cuir, le métal, la pierre, le bois, le verre, le tissu, ainsi que les machinistes et ceux qui peuvent être amenés à utiliser de la technologie humaine. Cette Caste très influente dispose de nombreuses ramifications au sein des sociétés humaines et héossiennes grâce aux nombreux Ateliers de production qu'elle gère et qui constituent autant de points névralgiques de l'économie héossienne.");
		novateurs.setDomaine(technique);
		novateurs = casteRepository.save(novateurs);

		erudits.setNomCaste("Erudits");
		erudits.setDescription(
				"C'est l'élite intellectuelle de la population héossienne. Tous les scientifiques, philosophes, littéraires, ingénieurs et juristes y sont représentés. Le Nouvel Ordre et les Grandes Familles se méfient toujours des Érudits, qui ont été les premiers à comprendre la culture technologique humaine.");
		erudits.setDomaine(savoir);
		erudits = casteRepository.save(erudits);

		negociants.setNomCaste("Négociants");
		negociants.setDescription(
				"La Caste des Négociants accueille tous ceux qui tissent des liens sociaux, que ce soit à but lucratif ou par intérêt politique. Cette Caste constitue la pierre angulaire de l'économie héossienne, mais est surtout un trait d' union avec les civilisations humaines et nécrosiennes. Le Négociant sait toujours tirer profit d'une situation, quelle qu'elle soit. Peu importe son interlocuteur, il sait que chacun dispose d'une faille qu'il suffit d'exploiter pour prendre l'avantage.");
		negociants.setDomaine(social);
		negociants = casteRepository.save(negociants);

		artistes.setNomCaste("Artistes");
		artistes.setDescription(
				"La Caste des Artistes rassemble tous ceux dont le but est de divertir la population, que ce soit par la musique, la danse, la comédie, la peinture, la gastronomie, la jonglerie ou les acrobaties. Le Nouvel Ordre n'aimait pas les Artistes, réprimant immédiatement toute manifestation publique. Avec la Révolution et la chute du régime humain, les choses ont changé et les Artistes sont aujourd'hui encouragés à créer, à exposer et à s'exprimer pour revaloriser la culture héossienne. Certains courants artistiques engendrent d'ailleurs de véritables effets de modes qui, grâce à Arpège, se diffusent à l'ensemble du continent, offrant aux Artistes une renommée, une notoriété et une popularité parfois plus importante que celle de toutes les autres Castes.");
		artistes.setDomaine(arts);
		artistes = casteRepository.save(artistes);

		shaanistes.setNomCaste("Shaanistes");
		shaanistes.setDescription(
				"Les Shaanistes sont des porteurs de lumière. Transmettant le Shaan à qui l'accepte, ils ont pour charge d'apaiser les Âmes, d'harmoniser les Esprits et de réguler toute sorte de fanatisme. Le Nouvel Ordre a systématiquement persécuté les Shaanistes. Les génocides qui se sont produits ont, pendant un moment, rendu la pratique du Shaan dangereuse, mais aucun de ses adeptes ne s'est détourné de sa voie.");
		shaanistes.setDomaine(shaan);
		shaanistes = casteRepository.save(shaanistes);

		magiciens.setNomCaste("Magiciens");
		magiciens.setDescription(
				"Les Magiciens utilisent les Trihns qui voyagent sur Héos et s'en servent comme combustible pour leurs Pouvoirs. Souvent en contact avec les autres Castes, ils les aident par leur savoir et leur pratique.");
		magiciens.setDomaine(magie);
		magiciens = casteRepository.save(magiciens);

		elementalistes.setNomCaste("Élémentalistes");
		elementalistes.setDescription(
				"Les Élémentalistes échappent au système de classement des autres Castes. Ils vouent un culte aux Éléments tels qu'ils sont représentés au sein du Cercle des Réalités. Chacun de ces Éléments constitue une voie qu'un Élémentaliste peut choisir de suivre. Si un Élémentaliste transgresse volontairement un de ses tabous, il attire la colère de l'Élément offensé. Pendant trois Jours, tous ses Tests de RITUELS impliquant cet Élément lui feront perdre un point de Corps supplémentaire à cause de cette agressivité élémentaire. Il sera en pénitence et devra passer ce temps à prier son Élément.");
		elementalistes.setDomaine(rituels);
		elementalistes = casteRepository.save(elementalistes);

		voyageurs.setNomCaste("Voyageurs");
		voyageurs.setDescription(
				"Cette Caste rassemble les anthéens chargés de transporter quelque chose ou quelqu'un d'un point à un autre. Les Sportifs qui vont de ville en ville font également partie de cette Caste. Les Voyageurs ont pu conserver une importance malgré la démocratisation des Portes de Transfert, car bien que plus lents, ils restent tout de même bien meilleur marché");
		voyageurs.setDomaine(survie);
		voyageurs = casteRepository.save(voyageurs);

		combattants.setNomCaste("Combattants");
		combattants.setDescription(
				"Cette Caste rassemble tous ceux qui ne vivent que par la guerre et le respect de l'ordre. Soldats, miliciens, gladiateurs, hommes de main en sont les dignes représentants. Entre les Castes, les Guildes, les Notables et les Grandes Familles, nombreux sont ceux qui les utilisent à tour de bras pour régler des conflits, protéger un lieu ou récupérer quelque chose.");
		combattants.setDomaine(combat);
		combattants = casteRepository.save(combattants);

		ombres.setNomCaste("Ombres");
		ombres.setDescription(
				"Cette Caste siège à l'Assemblée Héossienne et dans les Conseils des Castes. Organisée de façon assez anarchique, elle suit malgré tout une hiérarchie pyramidale, chapeauté par plusieurs Parrains dont l'identité n'est jamais clairement établie, mais qui imposent leur autorité par la peur.");
		ombres.setDomaine(necrose);
		ombres = casteRepository.save(ombres);

//-------------------------------------------------------------------------------------------------------------------------
//				REMPLISSAGE OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		batisseur.setNomMetier("Batisseur");
		batisseur.setVoie("Voie de la Terre");
		batisseur.setCasteLie(novateurs);
		batisseur.setDescription(
				"Les Bâtisseurs savent construire des ponts, des maisons, des routes, tailler la pierre et préparer la Trihnite afin qu'elle soit enchantée. Irascibles aux mains cagneuses, ils passent leur temps à râler car rien ne se passe jamais comme ils avaient prévu. Il faut dire que l'exigence des Bâtisseurs est légendaire, car ils restent conscients que la plus petite erreur de calcul, ou le moindre défaut de construction peut être à l'origine de terribles accidents et causer la mort... Ce sens des responsabilités leur met une pression permanente qu'ils entretiennent, même s'ils n'ont pas de chantier à gérer. Mais c'est ainsi, les Bâtisseurs se sentent responsables des autres...");
		batisseur = metierRepository.save(batisseur);

		charpentier.setNomMetier("Charpentier");
		charpentier.setVoie("Voie du Végétal");
		charpentier.setCasteLie(novateurs);
		charpentier.setDescription(
				"Le bois est l'une des matières premières les plus travaillées au sein de la société héossienne, que ce soit pour faire des meubles, des bateaux, du papier, des cordages, ou des habitations, on en voit partout. Le savoir-faire du Charpentier est immense et lui permet de sculpter finement une pièce d'échec ou bien de découper et de tailler des arbres géants qui feront des mâts de bateau-monde. Peu loquace, le Charpentier aime travailler en silence. Et lorsqu'on le questionne sur son mutisme il explique qu'il écoute le bois lui parler, et qu'il ne veut pas lui couper la parole...");
		charpentier = metierRepository.save(charpentier);

		couturier.setNomMetier("Couturier");
		couturier.setVoie("Voie de l'Eau");
		couturier.setCasteLie(novateurs);
		couturier.setDescription(
				"Le Couturier est amené à travailler avec de nombreux corps de métiers, qui vont lui fournir la matière première dont il aura besoin pour fabriquer des bottes, des capes, des chemises, des chapeaux, des pantalons, mais aussi des voiles de bateau, des drap ou des tapis. Certains Notables s'entichent de créateurs de haute couture et leur financent des défilés prestigieux chorégraphiés comme de grands spectacles avec son et lumière. Les vêtements ainsi mis en scène valent de véritables fortunes. Tous les Notables de la région se rendent à ces défilés qu'il convient de fréquenter pour bien se faire voir des autres Notables. Ces derniers se livrent une véritable compétition par défilé interposé, car celui qui saura proposer la meilleure prestation se verra glorifié pendant un mois. Dans ce jeu de pouvoir, les Couturiers peuvent amasser des fortunes mais également subir le courroux de Notables mécontents et tomber en disgrâce.");
		couturier = metierRepository.save(couturier);

		forgeron.setNomMetier("Forgeron");
		forgeron.setVoie("Voie du Feu");
		forgeron.setCasteLie(novateurs);
		forgeron.setDescription(
				"Le Forgeron reste l'artisan le plus sollicité en Héossie, car ses capacités à fondre le métal pour en faire des armes, des armures, des outils, des renforts, et toutes sortes de pièces mécaniques sont fort utiles aux membres de toutes les castes. Bien bâti et musculeux, le Forgeron ne se ménage jamais, car pour plier le métal à sa volonté, il faut faire preuve de force et de patience. Constamment confronté à des températures très élevées, le Forgeron se révèle très frileux lorsqu'il s'agit de sortir de son atelier. Il déteste le froid et d'un tempérament casanier, il n'aime pas partir à l'aventure, préférant marteler le métal à longueur de journée. Certains Forgerons arrivent à ciseler de longues épées affûtées comme un rasoir et légères comme une plume... Ces épées, très prisées des maîtres d'armes émérites, peuvent se vendre à prix d'or.");
		forgeron = metierRepository.save(forgeron);

		infotek.setNomMetier("Infotek");
		infotek.setVoie("Voie des Limbes");
		infotek.setCasteLie(novateurs);
		infotek.setDescription(
				"L'Infotek est l'archétype de l'ingénieur technique, plus à l'aise avec les machines et les codes de programmation qu'avec les êtres vivants. Totalement investi dans son métier, l'Infotek passe beaucoup de temps sur Arpège pour son travail ou ses loisirs, ce qui fait que la plupart se font greffer des modules de neurocodage avec des prothèses rétiniennes afin d'être connectés en permanence sur le réseau et de pouvoir s'y déplacer en clignant les yeux. Peu loquace, l'Infotek est renfermé sur lui-même et n'est à l'aise qu'en compagnie d'autres Infoteks. Maîtrisant la technologie humaine sur le bout des doigts, ils savent démonter et remonter une arme à feu, un moteur de véhicule, ont des notions de biomorphie et peuvent créer des programmes en code Note qui pourront être exploités sur le rézo Arpège.");
		infotek = metierRepository.save(infotek);

		joaillier.setNomMetier("Joaillier");
		joaillier.setVoie("Voie de l'Autre");
		joaillier.setCasteLie(novateurs);
		joaillier.setDescription(
				"Le Joaillier est un sculpteur de lumière. Qu'importe le matériau, verre, diamant, perle, cristal, il sait le tailler pour en faire un bijou unique, une pièce de collection que les Notables s'arracheront à prix d'or. Le Joailler travaille souvent avec le Couturier pour la confection de tous les accessoires d'un vêtement de collection. Mais le Joaillier intervient également pour la fabrication d'objets moins prestigieux où ses compétences de souffleur de verre lui permettent de réaliser loupes, fenêtres, lunettes mais aussi verres et carafes. D'ailleurs, il règne un certain mépris au sein des Joailliers. Ceux liés à la mode considèrent les artisans du verre comme des tâcherons et les artisans du verre considèrent les orfèvres comme des imposteurs... Rares sont ceux qui peuvent se permettre de travailler dans ces deux spécialisations en même temps...");
		joaillier = metierRepository.save(joaillier);

		mecaniste.setNomMetier("Mécaniste");
		mecaniste.setVoie("Voie de l'Objet");
		mecaniste.setCasteLie(novateurs);
		mecaniste.setDescription(
				"Le Mécaniste dispose d'une horloge interne extrêmement bien développée, qui lui permet d'analyser le fonctionnement des machines et d'en appréhender intuitivement le fonctionnement. Réparateur hors-pair, il trouve toujours la panne au bon endroit et dispose à chaque fois des outils adéquats pour travailler dans de bonnes conditions. Très méticuleux, le Mécaniste a tendance à être un maniaque de l'ordre et du rangement. Pour lui, chaque chose a une place et ne saurait en changer.");
		mecaniste = metierRepository.save(mecaniste);

		pilote.setNomMetier("Pilote");
		pilote.setVoie("Voie de l'Air");
		pilote.setCasteLie(novateurs);
		pilote.setDescription(
				"Les Pilotes ont su domestiquer la technologie humaine liée aux véhicules, terrestres, aériens ou aquatiques. Ils peuvent passer d'un autojet à un croiseur lourd à chenilles, d'une simple moto, à un hydroscape en un claquement de doigt. Le Pilote ne fait qu'un avec son engin qui devient avec l'expérience une extension de son propre corps. C'est cette sorte d'osmose technique qui permet aux Pilotes chevronnés de manœuvrer avec talent dans des situations critiques.");
		pilote = metierRepository.save(pilote);

		recuperateur.setNomMetier("Récupérateur");
		recuperateur.setVoie("Voie du Moi");
		recuperateur.setCasteLie(novateurs);
		recuperateur.setDescription(
				"Le Récupérateur ne jette jamais rien. Pour lui tout peut toujours servir à un moment ou à un autre. Son habitation prend alors des allures de décharge publique, au grand désespoir de ceux qui vivent à ses côtés. Même lorsqu'il est en voyage, le Récupérateur ne peut s'empêcher de ramasser tout ce qu'il trouve. Et même si parfois, un Récupérateur trop encombré peut ralentir un groupe, celui-ci sait que le moment venu, le Récupérateur aura ce qu’il lui faut pour fabriquer l'outil, l'arme ou l'objet qui permettra à tous de sortir d'une situation périlleuse...");
		recuperateur = metierRepository.save(recuperateur);

		tanneur.setNomMetier("Tanneur");
		tanneur.setVoie("Voie de l'Animal");
		tanneur.setCasteLie(novateurs);
		tanneur.setDescription(
				"Pour le Tanneur, l'animal est le bien le plus précieux qui soit. Et il sait qu'un animal en bonne santé donnera toujours un cuir de meilleure qualité. C'est pour cela que le Tanneur est naturellement bienveillant envers les animaux, même ceux dont il ne travaille pas la peau, la laine ou la fourrure. Il respecte le règne animal et avant de tuer une bête, il s'arrange toujours pour lui rendre hommage en lui adressant quelques prières bienveillantes. Le Tanneur connaît toutes les techniques pour dépecer un animal en optimisant les découpes pour obtenir les pièces de cuir les plus grandes possibles.");
		tanneur = metierRepository.save(tanneur);

		alchimiste.setNomMetier("Alchimiste");
		alchimiste.setVoie("Voie du feu");
		alchimiste.setCasteLie(erudits);
		alchimiste.setDescription(
				"L'Alchimiste aime défier la nature. Il passe son temps à transformer la matière, à la modeler pour qu’elle s'adapte à sa volonté. Il est convaincu de la supériorité de son esprit sur les éléments. Créateur de formules alchimiques qui permettent, telles des recettes de cuisine, de confectionner un plat original à partir d'ingrédients divers, l'Alchimiste a la faculté d'accéder à l'irrationnel et au surnaturel par la voie de la science. Les Alchimistes peuvent ainsi créer des potions, des onguents, des poudres qui permettent d'accroître ses capacités ou même de disposer de pouvoirs spéciaux.");
		alchimiste = metierRepository.save(alchimiste);

		archiviste.setNomMetier("Archiviste");
		archiviste.setVoie("Voie de l'Objet");
		archiviste.setCasteLie(erudits);
		archiviste.setDescription(
				"L'Archiviste est un vrai rat de bibliothèque et dispose d'une mémoire phénoménale. Il connait tous les ouvrages qui sont répertoriés dans ses rayonnages, même s'il y en a plusieurs milliers. Mais surtout, il sait où chacun de ces livres se trouve. L'Archiviste reste la personne indispensable pour tous les chercheurs et les enseignants, car non seulement il peut fournir ce qu'on lui demande, mais en plus il n'est jamais avare de conseils et propose toujours des livres en plus, en rapport avec une problématique mais qui apportent un éclairage complémentaire.");
		archiviste = metierRepository.save(archiviste);

		botaniste.setNomMetier("Botaniste");
		botaniste.setVoie("Voie du Végétal");
		botaniste.setCasteLie(erudits);
		botaniste.setDescription(
				"Le Botaniste partage son temps entre ses expéditions en pleine nature à la recherche de nouveaux spécimens afin d'enrichir sa collection personnelle et ses herbiers, et son atelier où il répertorie, analyse, compare et étudie toutes les nouvelles espèces qu'il a pu collecter. Connaissant parfaitement le règne végétal, il peut communiquer avec des êtres-plante doués d'intelligence lorsqu'il est amené à en croiser dans ses nombreux voyages... Le Botaniste en sait tout autant sur les plantes médicinales, les poisons ou les fruits et légumes. Les champignons et leurs nombreuses familles font également partie du domaine d'expertise du botaniste.");
		botaniste = metierRepository.save(botaniste);

		esoteriste.setNomMetier("Esotériste");
		esoteriste.setVoie("Voie de l'Air");
		esoteriste.setCasteLie(erudits);
		esoteriste.setDescription(
				"L'Ésotériste est passionné par tout ce qui est occulte et en relation avec les forces surnaturelles d'Héos. Il maîtrise parfaitement la divination à l'aide du tarot héossien, et est capable de prévoir les chemins de vie des êtres et des choses dans le Cercle des Réalités. L'ésotérisme héossien puise ses racines bien avant l'antiquité, où les peuplades primitives entraient déjà en communion avec les Trihns, les éléments et les dieux... La force mentale de l'Ésotériste lui permet de résister aux attaques mentales qui lui sont destinées.");
		esoteriste = metierRepository.save(esoteriste);

		geologue.setNomMetier("Géologue");
		geologue.setVoie("Voie de la Terre");
		geologue.setCasteLie(erudits);
		geologue.setDescription(
				"Le Géologue sait lire dans la pierre et dans les sols l'histoire de la formation des continents et des âges. Les croyants se plaisent à étudier le martèlement des géants, à l'origine de la formation des reliefs et des montagnes, les pragmatiques ne prennent en compte que les phénomènes d'érosion naturelle et de la tectonique des plaques. Les Géologues sont aussi experts en ce qui concerne les sources d'énergie naturelle et la manière dont on peut l'extraire et la transformer. Ils disposent également de grandes connaissances sur la Trihnite, sa composition et les origines de sa formation...");
		geologue = metierRepository.save(geologue);

		historien.setNomMetier("Historien");
		historien.setVoie("Voie du Moi");
		historien.setCasteLie(erudits);
		historien.setDescription(
				"L'Historien est un phare dans la reconstruction de la civilisation héossienne. Membre actif de la Résistance il fut un temps, il sait relier les éléments du présent au passé afin de se projeter dans l'avenir. Car l'Historien n’a de cesse d'expliquer à qui veut l'entendre que l'Histoire se répète toujours... L'Historien maîtrise l'Histoire héossienne, mais également tous les mythes fondateurs et les légendes qui lui sont associées. Il est souvent bavard et intarissable dès qu'on le lance sur un fait historique ou un personnage célèbre, car comme tout est lié, il peut remonter à l'antiquité pour expliquer pourquoi tel empereur darken contemporain a été banni, ou encore comment le conflit nécrosien qui se prépare est un écho de ce qui a pu se produire au niveau local quelques centaines d'années auparavant.");
		historien = metierRepository.save(historien);

		juriste.setNomMetier("Juriste");
		juriste.setVoie("Voie de l'Eau");
		juriste.setCasteLie(erudits);
		juriste.setDescription(
				"« Que vous soyez puissant ou misérable, vous serez jugés innocent ou coupable » relatait un conteur de l'antéhistoire humaine mettant en scène des animaux. Le Juriste fera toujours tout son possible pour contredire cet adage, même si dans bon nombre d'affaires impliquant des Notables, ces derniers bénéficient toujours de circonstances favorables ou minimisant leurs actes, là où le commun des mortels irait tout droit en prison. Car faire appel à un Juriste pour se défendre alors que l'on subit une attaque judiciaire coûte cher. Et plus l'affaire est complexe, plus le Juriste approprié sera onéreux.");
		juriste = metierRepository.save(juriste);

		medecin.setNomMetier("Médecin");
		medecin.setVoie("Voie de l'Autre");
		medecin.setCasteLie(erudits);
		medecin.setDescription(
				"Le Médecin sait diagnostiquer et soigner les maladies et les blessures du Corps. À la fois chirurgien et pharmacien, il sait quel médicament prescrire pour lutter contre une maladie ou quel antidote est nécessaire pour contrer la virulence d'un poison. D'un sang-froid à toute épreuve, le Médecin sait faire face à n'importe quelle situation, même périlleuse. En plein combat, il sait garder son flegme et peut effectuer une opération chirurgicale de grande ampleur, en conservant des gestes précis. Certains humoristes caricaturent souvent les Médecins en les mettant dans des situations improbables, très dangereuses et en leur faisant réaliser toutes sortes d'actions très compliquées, comme si de rien n'était.");
		medecin = metierRepository.save(medecin);

		percepteur.setNomMetier("Percepteur");
		percepteur.setVoie("Voie des Limbes");
		percepteur.setCasteLie(erudits);
		percepteur.setDescription(
				"Le Percepteur est chargé de collecter les impôts auprès des Héossiens pour le compte des Humains, des Grandes Familles et de certains Notables. Entre deux mondes, le Percepteur sait se fondre au sein des Humains et connaît tout de leur mode de vie, de leurs codes, de leur langue et de leur folie... Peu apprécié des Héossiens, le Percepteur a eu son heure de gloire du temps où la théocratie du Nouvel Ordre était plus draconienne. Avec l'assouplissement des lois, il se fait parfois rejeter voire même agresser en signe de représailles, pour les services qu'il a rendus par le passé.");
		percepteur = metierRepository.save(percepteur);

		zoologue.setNomMetier("Zoologue");
		zoologue.setVoie("Voie de l'Animal");
		zoologue.setCasteLie(erudits);
		zoologue.setDescription(
				"Le Zoologue est un collectionneur, il passe son temps à collecter et mettre à jour toutes les informations liées à une espèce animale ou à un écosystème. Bon nombre de Zoologues disposent de petits talents artistiques qui leur permettent de dessiner ce qu'ils sont amenés à observer sur le terrain. Certains Zoologues se spécialisent dans la connaissance de certains types d'animaux, les prédateurs, les herbivores, les nomades, les poissons, les oiseaux, les amphibiens, les reptiles... Un Zoologue est aussi un peu vétérinaire et connait les premiers soins à apporter à un animal blessé, et les gestes à effectuer pour sauver des vies. Assez impulsif dans son comportement, le Zoologue accorde beaucoup d'importance à son odorat : il peut ainsi récupérer des informations que les autres sens ne lui permettent pas de saisir. C'est pour cette raison que les meilleurs Zoologues sont Woons.");
		zoologue = metierRepository.save(zoologue);

		courtisan.setNomMetier("Courtisan");
		courtisan.setVoie("Voie du feu");
		courtisan.setCasteLie(negociants);
		courtisan.setDescription(
				"Les Courtisans savent obtenir tout ce qu'ils désirent en jouant avec les instincts primaires des individus. Se créer un personnage qui fera rêver son ou sa partenaire est pour le courtisan une habitude qu'il n'est pas toujours facile à tenir, surtout lorsque les conquêtes sont nombreuses. Les Courtisans œuvrent principalement auprès des Notables et des personnes de pouvoir, afin d'obtenir des informations ou de l'argent, selon qu'ils agissent pour des commanditaires ou pour leur propre compte. Certain Courtisans aiment juste séduire pour le plaisir, car ils se sentent ainsi désirés et donc exister. Les Courtisans savent enivrer les Corps, bousculer les Esprits et cueillir les Âmes. Le vrai talent du Courtisan est de ne jamais rompre, de s'arranger pour que les personnes qu'il a séduites reste toujours dans l'attente d'une éventuelle poursuite de la relation. C'est ce qui prend le plus de temps aux Courtisans : entretenir la flamme de ceux qu'ils ont envoûtés afin que l'amour ne se transforme jamais en haine... Mais rares sont ceux qui y arrivent et pour la plupart des Courtisans et Courtisanes, il y a des villes au sein desquelles ils ne peuvent plus mettre les pieds, sous peine d'être arrêtés sur-le-champ par un potentat local qui se sera senti trahi...");
		courtisan = metierRepository.save(courtisan);

		cyberien.setNomMetier("Cybérien");
		cyberien.setVoie("Voie de l'Objet");
		cyberien.setCasteLie(negociants);
		cyberien.setDescription(
				"Le domaine de prédilection du Cybérien, c'est le réseau Arpège. Cette fameuse toile où circulent des milliards d'informations à chaque seconde et qui sert de liant à toute la société humaine. Média, logiciels, informations, livres, apprentissage, juridiction, livres sacrés, tout est sur Arpège. Le Cybérien est un expert pour rechercher des données, tromper la vigilance des systèmes de surveillance ou négocier toutes sortes de produits sur des sites marchands. Car les interfaces informatiques ont tellement évolué, qu'elles ont en fait disparu au profit du simple langage vocal. Donc n'importe qui sachant parler peut en théorie faire ce qu'il veut sur Arpège, encore faut-il savoir comment dire les choses et où aller... Le Cybérien maîtrise toute la dialectique du rézo et peut, dès l'instant où il dispose d'une borne d'accès, se jouer de toutes les entraves humaines.");
		cyberien = metierRepository.save(cyberien);

		diplomate.setNomMetier("Diplomate");
		diplomate.setVoie("Voie de l'Eau");
		diplomate.setCasteLie(negociants);
		diplomate.setDescription(
				"Entre \"le marteau et l'enclume\", le Diplomate est là pour gérer les conflits entre les royaumes. Une déclaration de guerre est pour le Diplomate un constat d'échec. Il doit connaître les généalogies de chaque dynastie, connaître les us et coutumes de chaque culture afin qu'au moment crucial de la négociation politique, il ne fasse aucun impair. Combien de déclarations de guerre ont été faites à cause d'une odeur mal interprétée par un roi woon, ou encore par un mauvais agencement de couleur de tenue pour un prince mélodien un peu caractériel. Le Diplomate peut agir pour le compte des Conseils des castes, mais également pour celui d'Humains affiliés au Nouvel Ordre ou aux Grandes Familles. Les Diplomates les plus chevronnés sont envoyés en territoire nécrosé afin de traiter avec les princes et autres spectres pour tenter de minimiser leurs désirs d'expansion...");
		diplomate = metierRepository.save(diplomate);

		enseignant.setNomMetier("Enseignant");
		enseignant.setVoie("Voie du Végétal");
		enseignant.setCasteLie(negociants);
		enseignant.setDescription(
				"L'Enseignant est là pour donner les bases d'une culture générale dans tous les domaines aux enfants de 6 à 15 ans. Au-delà, les disciplines plus spécialisées sont enseignées par des membres éminents de chaque caste. L'Enseignant doit avoir une culture transversale et ne pas se contenter d'une vision parcellaire du monde, tout ce qu'il enseigne est lié et touche à de nombreuses matières en même temps. Disponible et à l'écoute des autres, l'Enseignant a toujours à cœur de transmettre quelque chose à son prochain, mais cela peut parfois être perçu comme de la prétention par son entourage, alors qu'il n'en est rien...");
		enseignant = metierRepository.save(enseignant);

		informateur.setNomMetier("Informateur");
		informateur.setVoie("Voie des Limbes");
		informateur.setCasteLie(negociants);
		informateur.setDescription(
				"L'Informateur est un élément indispensable, dès qu'il s'agit de faire une enquête ou d'obtenir des informations au sein d'un milieu urbain. Il entend tout, voit tout et sait tout, grâce à ses nombreux réseaux de renseignement qui lui rendent compte en temps réel de la situation sociale, politique, économique d'un quartier et même de toute une ville pour les plus influents. Curieux et à l'affût des moindres faits et gestes des puissants et des Notables, les Informateurs connaissent et maîtrisent tous les us et coutumes citadins afin de se fondre dans la masse.");
		informateur = metierRepository.save(informateur);

		marchand.setNomMetier("Marchant");
		marchand.setVoie("Voie de l'Air");
		marchand.setCasteLie(negociants);
		marchand.setDescription(
				"Le commerce a toujours été moteur au sein de la civilisation héossienne, comme partout ailleurs. Les Marchands jouissent de reconnaissance et de prestige auprès des Notables car ils constituent l'un des rouages fondamentaux de l'économie. Du simple vendeur au négociateur de contrats avec de grandes puissances, les Marchands sillonnent l'Héossie à la recherche de la bonne affaire qui fera d'eux des hommes riches. Car devenir Notable est pour un Marchand le but absolu. Pour un Marchand tout se vend ou s'achète, même l'amitié... Cela peut parfois créer des tensions au sein du groupe dont il peut faire partie, car malheureusement la plupart des marchands mettra toujours le profit avant l'éthique...");
		marchand = metierRepository.save(marchand);

		politicien.setNomMetier("Politicien");
		politicien.setVoie("Voie du Moi");
		politicien.setCasteLie(negociants);
		politicien.setDescription(
				"La géopolitique héossienne est devenue extrêmement complexe et délicate, entre les alliances que tissent Grandes Familles, Nouvel Ordre, Notables Héossiens, Conseils des castes et royaumes nécrosiens, difficile de savoir pour quel camp on œuvre réellement. Le politicien sait nager en eaux troubles et toujours retomber sur ses pattes, quel que soit son interlocuteur. Ami, ennemi, allié, partisan, contradicteur, le politicien a toujours quelque chose à dire et à répondre. Sa capacité à rebondir sur les arguments de ses détracteurs lui permet de faire croire ce qu'il veut à n'importe qui.");
		politicien = metierRepository.save(politicien);

		prospecteur.setNomMetier("Prospecteur");
		prospecteur.setVoie("Voie de l'Animal");
		prospecteur.setCasteLie(negociants);
		prospecteur.setDescription(
				"Le Prospecteur est un aventurier, envoyé dans les coins les plus reculés et isolés du monde afin de défricher de nouveaux marchés potentiels. Il est habitué à se débrouiller seul et sait s'adapter à n'importe quelle situation. Son expérience lui a permis de décrypter les signaux émis par les peuples primitifs qui ne parlent pas sa langue et il sait aussi se faire comprendre d'eux grâce à un mélange de sons, de langage des signes et de dessins. Certains Prospecteurs réussissent même à se faire comprendre des animaux, évitant ainsi de se faire attaquer par un prédateur mal intentionné.");
		prospecteur = metierRepository.save(prospecteur);

		tenancier.setNomMetier("Tenancier");
		tenancier.setVoie("Voie de la Terre");
		tenancier.setCasteLie(negociants);
		tenancier.setDescription(
				"Le Tenancier est un pragmatique. Habitué à tenir une auberge, une échoppe, une boutique, un restaurant, il doit toujours savoir à qui il a affaire pour ne prendre aucun risque et surtout se donner les meilleures chances de vendre les services qu'il a à proposer. Connaissant parfaitement tous les archétypes psychologiques et les ficelles qu'il faut tirer pour obtenir ce que l'on veut, il sait jauger quelqu'un d'un regard, et le moindre détail saura lui révéler un fragment de personnalité. Le Tenancier sait désamorcer les conflits et trouver les mots pour éviter que les situations ne s'enveniment.");
		tenancier = metierRepository.save(tenancier);

		traducteur.setNomMetier("Traducteur");
		traducteur.setVoie("Voie de l'Autre");
		traducteur.setCasteLie(negociants);
		traducteur.setDescription(
				"Le Traducteur connaît les diverses langues raciales héossiennes et peut comprendre la plupart des dialectes locaux en en comprenant les origines linguistiques. Indispensable pour toute transaction personnalisée, le Traducteur dispose d'un grand pouvoir car il peut selon ses intérêts favoriser l'une ou l'autre partie. C'est pour cela que chaque partie dispose de son Traducteur afin d'être sûr de ce qui est traduit. Mais il n'est pas rare que les Traducteurs de parties adverses se mettent d'accord au départ de l'issue d'une transaction et se répartissent ensuite les bénéfices de leurs petites arnaques. Pour éviter cela, le Traducteur doit prêter serment devant le Cercle des Réalités afin de pouvoir exercer son métier sans susciter la méfiance de ses interlocuteurs.");
		traducteur = metierRepository.save(traducteur);

		bateleur.setNomMetier("Bateleur");
		bateleur.setVoie("Voie du Feu");
		bateleur.setCasteLie(artistes);
		bateleur.setDescription(
				"Le Bateleur est un fougueux. Artiste des rues, il livre un combat permanent contre lui-même afin de prouver à la face du monde qu'il existe. Le Feu est son élément et il le maîtrise à la perfection, que ce soit pour le cracher, l'utiliser pour des éclairages subtils ou pour concevoir des feux d'artifice grandiloquents et mémorables. Le Bateleur a de la gouaille et il harangue les passants afin qu'ils assistent au spectacle de sa troupe, quitte à hausser le ton...");
		bateleur = metierRepository.save(bateleur);

		chanteur.setNomMetier("Chanteur");
		chanteur.setVoie("Voie de l'Air");
		;
		chanteur.setCasteLie(artistes);
		chanteur.setDescription(
				"Le Chanteur est son propre instrument. Ses vocalises entretiennent sa voix, chose qu'il a de plus précieux au monde.... Avoir une extinction de voix constitue pour un Chanteur le supplice le plus traumatisant. Certains ne s'en sont même jamais remis et sont devenus fous. Mais lorsque le Chanteur est en pleine possession de ses moyens, il sait qu'il dispose d'une force mystique, qui s'affranchit du langage pour communier directement avec l'Âme. Il peut alors ne faire qu'un avec son public et l'emmener vers des destinations gorgées de béatitude et d'émotions.... Les Chanteurs sont les artistes les plus appréciés et nombreux sont ceux qui disposent d'un statut de Notable et d'une cour de sympathisants.");
		chanteur = metierRepository.save(chanteur);

		comedien.setNomMetier("Comédien");
		comedien.setVoie("Voie de l'Autre");
		comedien.setCasteLie(artistes);
		comedien.setDescription(
				"Les Comédiens ont toujours été appréciés du public, mais il ne disposent pas de l'aura mystique des Chanteurs. Le Comédien oscille entre tragédie, comédie et a parfois du mal à dissocier le réel de son imaginaire. Le Comédien est habitué à vivre en troupe et à sillonner les routes pour ses diverses représentations. Mais la vie de Comédien est souvent faite de solitude, car une fois la tournée terminée, la troupe se défait et les Comédiens peuvent ne jamais se revoir. C'est pour cela que les Comédiens sont toujours extrêmement chaleureux car ils savent qu'ils ont peu de temps pour être efficaces et bien s'entendre, afin d’assurer la réussite du spectacle. La présence d'un Comédien au sein d'un Shaani est toujours le gage d'une bonne humeur communicative.");
		comedien = metierRepository.save(comedien);

		costumier.setNomMetier("Costumier");
		costumier.setVoie("Voie des Limbes");
		costumier.setCasteLie(artistes);
		costumier.setDescription(
				"Le Costumier mène une double vie, à la fois styliste de mode, il maîtrise toutes les techniques de confection du tissu, maîtrise la science des étoffes et l'histoire du costume. Ses talents sont indispensables à toute création théâtrale ou autre spectacle vivant. Mais en secret, le Costumier se fait aussi créateur de déguisements en vue de tromper la sagacité des individus. Il sait confectionner des masques plus vrais que nature et pourrait faire passer un Kelwin pour un Woon.... Tous les services secrets, de la Résistance aux agents du Nouvel Ordre, paient à prix d'or les services des Costumiers qui leur permettent de donner n'importe quelle apparence à n'importe qui...");
		costumier = metierRepository.save(costumier);

		cuisinier.setNomMetier("Cuisinier");
		cuisinier.setVoie("Voie de la Terre");
		cuisinier.setCasteLie(artistes);
		cuisinier.setDescription(
				"La gastronomie héossienne constitue un art des plus illustres. Chaque année, nombreux sont les tournois qui mettent en concurrence les plus grands chefs gastronomiques afin que soit élu le meilleur Maître des saveurs. La compétition se déroule sur plusieurs semaines et des milliers de cuisiniers affluent de toute l’Héossie pour y participer. S’enchainent alors des plats mêlant toutes sortes de saveurs, des plus douces aux plus amères, compensées par des notes relevées et sucrées. Le travail sur les textures, les matières, les couleurs, la composition est également essentiel, et certains Cuisiniers ont recours aux services d’Évocateurs afin de sublimer leurs plats. Bon vivant par excellence, le Cuisinier est un compagnon de route très recherché car avec peu d’ingrédients, il est capable de faire de grands festins. La prise d’embonpoint est quasiment inévitable et ce dans la mesure où le Cuisinier, avant de servir ce qu’il a préparé, se fait un devoir de tout goûter (pour être certain des saveurs qu’il va proposer à ses convives). L’art de la cuisine héossienne suit la symbolique des Trihns, le salé correspond au Corps, le sucré à l’Âme et l’amer à l’Esprit. L’acidité, quant à elle, est plus liée à la Nécrose.");
		cuisinier = metierRepository.save(cuisinier);

		danseur.setNomMetier("Danseur");
		danseur.setVoie("Voie de l'Animal");
		danseur.setCasteLie(artistes);
		danseur.setDescription(
				"La danse est ce qui relie l'Âme au Corps. Bouger son Corps, c'est élever son Âme... Le Danseur, en communion avec les forces telluriques ancestrales, communique ses émotions à son public. Son langage est universel et perceptible, depuis le fin fond des régions les plus primitives de l'Héossie, aux diverses cours des Grandes Familles et autres Notables. Plutôt de nature solitaire, le Danseur travaille aussi en troupe et pratique la vie en communauté, tout comme les Comédiens. Il a le rythme dans la peau, dans le sang et est souvent à la recherche du Musicien avec qui il pourra créer le spectacle ultime où musique et danse ne font plus qu'un.");
		danseur = metierRepository.save(danseur);

		ecrivain.setNomMetier("Ecrivain");
		ecrivain.setVoie("Voie du Végétal");
		ecrivain.setCasteLie(artistes);
		ecrivain.setDescription(
				"L'Écrivain est un jongleur de mots. Passé maître dans l'art de les agencer, il sait créer l'émotion, faire passer du rire aux larmes, raconter des histoires extraordinaires ou faire des descriptions minutieuses... Son imaginaire fertile et sa sensibilité à fleur de peau lui permettent de capter ce que les gens habituellement ne voient pas. Se faire éditer et toucher le plus grand nombre constitue pour l'Écrivain une sorte de quête ultime car rares sont ceux à y être parvenus et à vivre correctement de leur art. L'Écrivain est un solitaire qui suit deux cycles de vie bien distincts. Le premier est un cycle d'imprégnation, où l'Écrivain va rechercher à vivre un maximum d'aventures et à accumuler de nombreuses expériences. Le second cycle est fait de recueillement et de production intensive où l'écrivain va coucher sur papier tout ce que son Âme lui dicte. Durant cette période, l'Écrivain est souvent de mauvaise humeur et asocial car il obtient rarement du premier coup le résultat qu'il espère. Certains Écrivains peuvent passer d'un cycle à l'autre dans une même journée...");
		ecrivain = metierRepository.save(ecrivain);

		evocateur.setNomMetier("Evocateur");
		evocateur.setVoie("Voie de l'Eau");
		evocateur.setCasteLie(artistes);
		evocateur.setDescription(
				"Souvent ermite et retranché dans son atelier, l'Évocateur oscille entre deux mondes : celui de sa pensée et celui de son inconscient. Peu importe le support, peinture, dessin, sculpture, il effectue un voyage intérieur pour tenter d'y trouver ce qui lui permettra de créer une œuvre universelle. Souvent dépressif, l'Évocateur ne cesse de dire que l'on ne peut créer en étant heureux.... Hyper sensible, il est sans cesse meurtri par la violence du quotidien. Il absorbe cette violence, la canalise et la transcende en une évocation picturale ou en volume chargé de trouver son public. Mais malheureusement, les Évocateurs restent souvent des artistes incompris.");
		evocateur = metierRepository.save(evocateur);

		musicien.setNomMetier("Musicien");
		musicien.setVoie("Voie du Moi");
		musicien.setCasteLie(artistes);
		musicien.setDescription(
				"On dit que la musique adoucit les mœurs, c'est une réalité. Le Musicien est une sorte de médecin de l'Âme. Dès qu'il se met à jouer, les tensions se figent, les inimitiés cessent. Le temps d'un morceau, les pires ennemis peuvent faire une trêve pour l'écouter ensemble.... Il existe une hiérarchie au sein des Musiciens, du simple interprète au compositeur, en passant par le virtuose ou le chef d'orchestre, chacun a sa place, mais doit la tenir... Il n'est pas bien vu de changer d'étiquette. La plus grande injustice pour les Musiciens est liée au temps. Certains voient leurs compositions traverser les âges là où d'autres ne seront l'auteur que d'une musique de mode, oubliée et chassée par la suivante...");
		musicien = metierRepository.save(musicien);

		prestidigitateur.setNomMetier("Prestidigitateur");
		prestidigitateur.setVoie("Voie de l'Objet");
		prestidigitateur.setCasteLie(artistes);
		prestidigitateur.setDescription(
				"Les Prestidigitateurs sont experts pour tromper l'attention de leur public et leur faire croire que ce qui n'est qu'un simple tour de passe-passe est le fruit d'une magie prodigieuse. Les Prestidigitateurs peuvent faire croire à la disparition ou à l'apparition d'objets divers de taille plus ou moins importante. Le Prestidigitateur n'est pas toujours honnête et se sert souvent de ses talents pour tricher aux jeux d'argent et ruiner ses adversaires. Beaucoup de Prestidigitateurs sont ainsi rapidement devenus des Notables. Mais ces Notables, lorsqu'ils tombent sur plus forts qu'eux, perdent très vite leur statut et peuvent finir dans la misère, brisés...");
		prestidigitateur = metierRepository.save(prestidigitateur);

		ameVive.setNomMetier("Ame-vive");
		ameVive.setVoie("Voie du Moi");
		ameVive.setCasteLie(shaanistes);
		ameVive.setDescription(
				"Les Âmes-vives sont les compagnons préférés de tous ceux qui doivent approcher la Nécrose de près ou de loin, ou qui peuvent être amenés à subir des effets nécrotiques... Cela fait beaucoup de monde en fait, si bien que les Âmes-vives sont très souvent sollicités, trop estiment-ils... Car les Âmes-vives ne sont pas des individus très sociables et il faut souvent déployer des trésors d'argumentation afin de les convaincre de bien vouloir exercer leurs compétences sur quelqu'un. Une Âme-vive, individualiste comme elle est, cherchera toujours un prétexte ou tentera de minimiser la situation pour ne pas avoir à rendre service... Mais la plupart des gens passent outre ce côté un peu antipathique car pour les Héossiens, l'Âme reste le Trihn le plus précieux pour éviter de passer du côté des Limbes...");
		ameVive = metierRepository.save(ameVive);

		chasseurDeSteles.setNomMetier("Chasseur de stèles");
		chasseurDeSteles.setVoie("Voie de l'Objet");
		chasseurDeSteles.setCasteLie(shaanistes);
		chasseurDeSteles.setDescription(
				"Les Chasseurs de stèles parcourent le monde à la recherche de stèles d'Embiose, afin de pratiquer le fameux rituel qui leur permet d'augmenter rapidement leurs capacités. Ils sont souvent de cheville avec les Traqueurs de stèles qui connaissent de très nombreux emplacements de stèles et les réseaux auxquels elles sont liées. Mais certains Chasseurs de stèles se nécrosent rapidement et pour endiguer le phénomène, voyagent avec des Âmes-vives afin de limiter la casse... Les Chasseurs de stèles ont du mal à se satisfaire de ce qu'ils ont : toujours portés vers l'avenir, ils ont souvent du mal à concilier le Shaan avec leurs aspirations.");
		chasseurDeSteles = metierRepository.save(chasseurDeSteles);

		cultivateur.setNomMetier("Cultivateur");
		cultivateur.setVoie("Voie du Végétal");
		cultivateur.setCasteLie(shaanistes);
		cultivateur.setDescription(
				"Propriétaire terrien ou simple vacataire, le Cultivateur passe sa vie dans les champs à semer et récolter des céréales, des fruits, des légumes ou des plantes aux vertus extraordinaires. Le Cultivateur peut parler au règne végétal et ainsi obtenir de précieuses informations sur un convoi qui aurait traversé une forêt ou bien sur les causes d'une projection de pollen empoisonné... Moins instruit qu'un Botaniste, le Cultivateur agit par instinct et suit le cycle des saisons de façon innée.");
		cultivateur = metierRepository.save(cultivateur);

		eleveur.setNomMetier("Eleveur");
		eleveur.setVoie("Voie de l'Animal");
		eleveur.setCasteLie(shaanistes);
		eleveur.setDescription(
				"La plupart des Éleveurs choisissent une seule espèce animale à élever, que ce soit pour leur viande, leur laine, leur cuir, leur lait, leurs cornes, leur graisse, leur sang ou toute autre matière utile... Ce peuvent être des animaux d'agrément, des bêtes de somme, des armimales, des montures ou des animaux pour le spectacle... Les Éleveurs prennent un grand soin à choisir les mâles et les femelles afin de pouvoir garantir un bon pedigree à leurs acheteurs. Les Éleveurs sont souvent en relation avec des Novateurs spécialisés qui s'occupent de récupérer les matières premières de l'animal. Normalement, les Éleveurs ne s'attachent pas à leurs animaux, afin de ne pas souffrir lorsque ces derniers les quittent d’une façon ou d’une autre. Mais certains tissent des liens empathiques très forts avec un animal : ce dernier perd alors son statut de bête pour gagner celui de compagnon et suivra l'Éleveur durant toute sa vie.");
		eleveur = metierRepository.save(eleveur);

		gardeFou.setNomMetier("Garde-fou");
		gardeFou.setVoie("Voie de l'Air");
		gardeFou.setCasteLie(shaanistes);
		gardeFou.setDescription(
				"Les Garde-fous aiment explorer les limites de ce qu'un cerveau peut accepter sans tomber dans la folie, tout en cherchant à repousser ces limites toujours plus loin... Pour cela, ils recherchent les situations les plus extrêmes et les environnements les plus déstabilisants... Adeptes des expéditions au sein de ruines oubliées, de forteresses hantées, et autres territoires terrifiants, les Garde-fous ont appris à dompter leur peur et celle de leurs proches. Peu appréciés des Négociants, les Garde-fous sont respectés par toutes les autres castes car ils permettent par leur simple présence de rassurer tous les membres d'un convoi qui doit se rendre dans des contrées hostiles.");
		gardeFou = metierRepository.save(gardeFou);

		marcheurDeReves.setNomMetier("Marcheurs de rêves");
		marcheurDeReves.setVoie("Voie des Limbes");
		marcheurDeReves.setCasteLie(shaanistes);
		marcheurDeReves.setDescription(
				"Les Marcheurs de rêves sont des traqueurs de songes nécrotiques. Leur capacité leur permet de résister aux assauts des cauchemars et de leur porter des attaques décisives. Les Marcheurs de rêves peuvent aussi envoyer des messages à ceux qui dorment, quel que soit l'endroit où ils se trouvent... Ils constituent ainsi un véritable rempart contre les empires nécrosiens qui terrorisent les populations dans leur sommeil. Les Marcheurs de rêves sont souvent accueillis en héros où qu'ils aillent, car la peur du nécrosien reste vivace dans chaque Esprit...");
		marcheurDeReves = metierRepository.save(marcheurDeReves);

		mentaliste.setNomMetier("Mentaliste");
		mentaliste.setVoie("Voie de l'Autre");
		mentaliste.setCasteLie(shaanistes);
		mentaliste.setDescription(
				"Les Mentalistes font partie des Shaanistes les plus appréciés au sein de la population héossienne. Toujours de bon conseil, ils connaissent parfaitement la psychologie anthéenne avec laquelle ils jouent pour tirer le meilleur parti de chaque individu, afin de créer de bonnes synergies entre les Peuples. Le Mentaliste ne perd jamais son sang-froid et aime beaucoup parler par enigmes ou métaphores : quelle que soit la situation, qu’il se trouve dans une Guilde sévère avec ses employés, ou dans une taverne sordide,. Il sait user de la rhétorique pour calmer les Esprits échauffés ou au contraire galvaniser ceux qui doutent d’eux. Le Mentaliste sait déchiffrer le moindre regard, le moindre geste et reste à l’affut de tous les signes que l’on émet inconsciemment...");
		mentaliste = metierRepository.save(mentaliste);

		prescient.setNomMetier("Prescient");
		prescient.setVoie("Voie de l'Eau");
		prescient.setCasteLie(shaanistes);
		prescient.setDescription(
				"Le Prescient vit dans un autre monde, fait de symboles et d'inspiration. Il a du flair et sait s'en servir. Il peut ainsi éviter de se faire surprendre et sentir lorsque l'on cherche à l'embobiner. L'intuition du Prescient est très utile dans toutes sortes de domaines, de la navigation, à la diplomatie en passant par la stratégie militaire ou encore la gastronomie... Le Prescient sait toujours ce qu'il doit faire et où il doit aller, cette aptitude en fait souvent un leader respecté.");
		prescient = metierRepository.save(prescient);

		radiant.setNomMetier("Radiant");
		radiant.setVoie("Voie de du Feu");
		radiant.setCasteLie(shaanistes);
		radiant.setDescription(
				"Il est coutume de dire que les Radiants ont du feu qui coulent dans les veines... Ils ont toujours chaud, où qu'ils se trouvent, cette chaleur surnaturelle leur permet lorsqu'ils apposent les mains sur quelqu'un de soigner le Corps. Contrairement aux Âmes-vives qui ont tendance à se faire prier pour faire usage de leurs compétences, les Radiants, à l'inverse, passent leur temps à demander autour d'eux si quelqu'un a besoin d'un soin, même si cela n'est pas indispensable. Ainsi, souvent, devant l'insistance des Radiants, on accepte leur aide pour ensuite avoir la paix. C'est en combat que les Radiants sont les plus épanouis, car là, ils peuvent exercer leur talent de nombreuses fois sans avoir à insister. Souvent, même, on le leur demande, et cela les emplit de joie, même si la situation s'avère critique...");
		radiant = metierRepository.save(radiant);

		telluriste.setNomMetier("Telluriste");
		telluriste.setVoie("Voie de la Terre");
		telluriste.setCasteLie(shaanistes);
		telluriste.setDescription(
				"Le Telluriste affectionne particulièrement les souterrains, les grottes et autres habitats troglodytes. En communion avec la pierre, la roche et la terre, il peut ressentir les micro-secousses sismiques qui agitent le continent en permanence mais auxquelles personne ne prête aucune attention. Pourtant, c'est grâce à ces secousses que le Telluriste peut s'orienter, connaître la nature d'un terrain ou d'un gaz. Mais ce qui rend le Telluriste particulièrement intéressant, c'est le lien privilégié qu'il entretient avec la Trihnite, grâce auquel il peut communiquer avec une porte de transfert pour obtenir des informations sur les personnes qui l'ont traversée...");
		telluriste = metierRepository.save(telluriste);

		arcanien.setNomMetier("Arcanien");
		arcanien.setVoie("Voie du Végétal");
		arcanien.setCasteLie(magiciens);
		arcanien.setDescription(
				"Les Arcaniens sont de vrais rats de bibliothèque, scrutant, archivant, lisant et relisant cent fois les mêmes passages de grands grimoires séculaires afin d'en débusquer le sens caché. Les Arcaniens connaissent toutes les formes de magie et peuvent avoir des notions dans chacune d'elles.");
		arcanien = metierRepository.save(arcanien);

		conjurateur.setNomMetier("Conjurateur");
		conjurateur.setVoie("Voie des Limbes");
		conjurateur.setCasteLie(magiciens);
		conjurateur.setDescription(
				"La peau tannée, craquelée, le regard noir, les Conjurateurs sont entre deux mondes, celui des Limbes et l'Héossie. Au bord du gouffre sans jamais tomber, ils arpentent les terres nécrotiques afin de les nettoyer de leurs Âmes corrompues. La vie et la mort sont pour eux sans importance, ils savent que l'un ne va pas sans l'autre et que les deux forment un cycle que l'on peut rompre ou accélérer à force de rigueur de de travail.");
		conjurateur = metierRepository.save(conjurateur);

		enchanteur.setNomMetier("Enchanteur");
		enchanteur.setVoie("Voie de l'Objet");
		enchanteur.setCasteLie(magiciens);
		enchanteur.setDescription(
				"Sages et laborieux, les Enchanteurs déroutent les gens par leur lenteur apparente. Mais ne vous y trompez pas, c'est une véritable tornade qui souffle dans la tête de ces individus. Un peu à part, le métier des Enchanteurs compte le plus de vieillards parmi ses membres. Il faut dire que la voie de l'enchantement est longue et rigoureuse. Elle laisse peu de temps aux autres activités.");
		enchanteur = metierRepository.save(enchanteur);

		illusionniste.setNomMetier("Illusionniste");
		illusionniste.setVoie("Voie de l'Eau");
		illusionniste.setCasteLie(magiciens);
		illusionniste.setDescription(
				"Ce sont les maîtres de la suggestion et de la discrétion. Les Illusionnistes savent camoufler les actes magiques afin qu'ils soient invisibles au commun des mortels. Privilégiant les sorts fondés sur la perception, ils peuvent avoir la capacité de faire entrer quelqu'un dans une monde virtuel et de l'y piéger... Du temps de l'Héossie flamboyante, les Illusionnistes avaient un statut très important au sein de la population. Ils permettaient aux gens de se divertir et de quitter le quotidien le temps d'un \"rêve éveillé\". Maintenant, de nombreux Illusionnistes gagnent leur vie en flattant les sens de gouverneurs humains et nécrosiens, trop heureux qu'il n'y ait pas d'accoutumance à ce moyen de quitter la réalité.");
		illusionniste = metierRepository.save(illusionniste);

		mageItinerant.setNomMetier("Mage itinerant");
		mageItinerant.setVoie("Voie du feu");
		mageItinerant.setCasteLie(magiciens);
		mageItinerant.setDescription(
				"Les Mages itinérants passent leur vie sur les routes afin de proposer leurs services à ceux qui en ont besoin. Habitués à vivre en extérieur, ils aiment voyager de nuit afin d'optimiser leurs déplacements. Leur spécialisation leur permet de voir dans l'obscurité et de toujours avoir un feu de camp à disposition. D'un tempérament vif, ils ont souvent tendance à s'emporter pour pas grand-chose.");
		mageItinerant = metierRepository.save(mageItinerant);

		regenerateur.setNomMetier("Régénérateur");
		regenerateur.setVoie("Voie de la Terre");
		regenerateur.setCasteLie(magiciens);
		regenerateur.setDescription(
				"Les Régénérateurs privilégient les Sorts de guérison afin de pouvoir subvenir rapidement aux besoins de leurs alliés blessés qui ont été victimes de traumatismes physiques, de violentes émotions ou de chocs psychologiques graves. Leur capacité à se régénérer les poussent à prendre soin des autres et à développer des Sorts de guérison ou d’autres Spécialisations de soins. Véritables médecins du Corps, de l’Âme et de l’Esprit, les Régénérateurs sont des compagnons indispensables pour les aventures dangereuses qui risquent de mettre en péril la santé de leurs alliés.");
		regenerateur = metierRepository.save(regenerateur);

		revocateur.setNomMetier("Révocateur");
		revocateur.setVoie("Voie du Moi");
		revocateur.setCasteLie(magiciens);
		revocateur.setDescription(
				"Passé maître dans l'art de se protéger des attaques magiques, les Révocateurs sont très appréciés des membres des autres castes. On peut même dire que c'est le métier le plus prisé de tous, tant la magie peut représenter une force de frappe redoutable et sur de nombreuses cibles. Les Révocateurs, d'un tempérament calme et posé, n'agissent jamais à la légère et préfèrent toujours être certains du type d'attaque dont il faut se protéger afin d'être le plus efficace possible : malheureusement il peut arriver que cette inertie soit fatale...");
		revocateur = metierRepository.save(revocateur);

		shaman.setNomMetier("Shaman");
		shaman.setVoie("Voie de l'Animal");
		shaman.setCasteLie(magiciens);
		shaman.setDescription(
				"En communion avec les Trihns, le Shaman sait les invoquer afin de les utiliser pour lancer des sortilèges. Lorsqu'un Trihn est utilisé, il donne juste de sa puissance au magicien, mais n'est pas détruit, il retourne ensuite dans son plan d'origine. Les Shamans connaissent bien les Trihns et restent particulièrement réceptifs aux besoins du Trihneï...");
		shaman = metierRepository.save(shaman);

		sorcier.setNomMetier("Sorcier");
		sorcier.setVoie("Voie de l'Air");
		sorcier.setCasteLie(magiciens);
		sorcier.setDescription(
				"Le Sorcier vit en ermite, se consacrant à la lecture et à l'apprentissage du langage des schèmes. Ayant souvent à sa disposition toutes sortes de grimoires où sont consignés quantité de Sorts sous forme de schèmes, il a la possibilité de créer lui-même ses propres Sorts et de les consigner sur papier.");
		sorcier = metierRepository.save(sorcier);

		voleurDeTrihn.setNomMetier("Voleur de trihn");
		voleurDeTrihn.setVoie("Voie de l'Autre");
		voleurDeTrihn.setCasteLie(magiciens);
		voleurDeTrihn.setDescription(
				"Le Voleur de Trihn a mauvaise réputation. Quand il est allié, on apprécie sa compagnie et ses talents galvanisent le groupe. Mais lorsqu'il se présente en ennemi, il devient souvent la principale cible des mages adverses qui ne peuvent se permettre de se laisser voler leurs Trihns. Pour cette raison, le Voleur de Trihn garde généralement la nature de son métier secrète et préfère mentir sur sa spécialisation.");
		voleurDeTrihn = metierRepository.save(voleurDeTrihn);

		discipleDeLAir.setNomMetier("Disciple de l'air");
		discipleDeLAir.setVoie("Voie de l'Air");
		discipleDeLAir.setCasteLie(elementalistes);
		discipleDeLAir.setDescription(
				"Le culte de l’Air pourrait se résumer en un mot : liberté. Liberté de penser, d’agir, de se déplacer, de créer. Les disciples de l’Air sont des nomades dans l’âme qui trouvent leur salut dans le voyage. Philosophes, certains disciples aiment à se perdre dans les méandres de la pensée et peuvent ainsi discuter pendant des jours sans s’arrêter. Le disciple d’Ëlhi n’est pas à la recherche de la connaissance absolue, mais de ses propres limites intellectuelles, le but étant de les repousser le plus loin possible. Adepte de l’autogestion, il a tendance à rejeter les rapports hiérarchiques. Très spontané, le disciple de l’Air dit toujours ce qu’il pense.");
		discipleDeLAir = metierRepository.save(discipleDeLAir);

		discipleDeLAnimal.setNomMetier("Disciple de l'animal");
		discipleDeLAnimal.setVoie("Voie de l'animal");
		discipleDeLAnimal.setCasteLie(elementalistes);
		discipleDeLAnimal.setDescription(
				"Le culte de l’Animal est l’un des plus répandus en Héossie. Prônant des valeurs d’énergie, de courage et d’autorité, il trouve largement sa place au sein des peuples de nature guerrière ou en prise directe avec la nature. Les disciples de l’Animal ont tendance à être assez primitifs et à réagir au quart de tour. Mais en amitié, ils savent aussi être fidèles et se comportent en chef de meute.");
		discipleDeLAnimal = metierRepository.save(discipleDeLAnimal);

		discipleDeLautre.setNomMetier("Disciple de l'Autre");
		discipleDeLautre.setVoie("Voie de l'Autre");
		discipleDeLautre.setCasteLie(elementalistes);
		discipleDeLautre.setDescription(
				"Le culte de l’Autre est l’un des plus appréciés en Héossie. Fondamentalement pacifiste dans l’âme, le disciple de l’Autre place le respect de la vie au cœur de toute chose. Mais le disciple de l’Autre n’est pas pour autant un imbécile, il est bien conscient que la violence peut s’avérer nécessaire pour sauver les faibles et surtout pour combattre la Nécrose. Car il n’est pas de culte plus hostile à la Nécrose que la voie de Löd. Pour ces disciples, l’âme est source de vie, la perdre, c’est ne plus être vivant.");
		discipleDeLautre = metierRepository.save(discipleDeLautre);

		discipleDeLEau.setNomMetier("Disciple de l'Eau");
		discipleDeLEau.setVoie("Voie de l'Eau");
		discipleDeLEau.setCasteLie(elementalistes);
		discipleDeLEau.setDescription(
				"Le culte de l’Eau puise ses racines dans l’enfance, dans le fluide amniotique. Les rêves, les secrets et ce qui échappe au sens commun des mortels reste familier aux yeux du disciple de l’Eau. Très joueur, il ne peut s’empêcher de relever les défis qu’on lui propose, quitte à mettre sa vie et celle de ses proches en danger. Le disciple de l’Eau vit dans son monde et peut donner l’impression d’être parfois absent. Mais ce n’est qu’une impression car le disciple de Rhéa est en contact direct avec le fluide vital des êtres...");
		discipleDeLEau = metierRepository.save(discipleDeLEau);

		discipleDeLObjet.setNomMetier("Disciple de l'Objet");
		discipleDeLObjet.setVoie("Voie de l'Objet");
		discipleDeLObjet.setCasteLie(elementalistes);
		discipleDeLObjet.setDescription(
				"Le culte de l’Objet fait partie des plus appréciés en Héossie, car il est l’apanage des artisans et des techniciens. Un disciple de l’Objet ayant toujours à cœur que les choses fonctionnent bien autour de lui et ne pourra s’empêcher de réparer ce qui est cassé. Très imaginatif, un disciple de l’Objet préfèrera toujours un moyen compliqué pour résoudre un problème donné ou une solution trop évidente et donc suspecte. Méthodique, le disciple de l’Objet peut paraître froid par moment lorsqu’il est plongé dans l’analyse de ce qui l’entoure. Il peut également faire preuve d’un détachement déconcertant vis à vis de la mort qui n’est pour lui qu’une panne définitive...");
		discipleDeLObjet = metierRepository.save(discipleDeLObjet);

		discipleDaLaTerre.setNomMetier("Disciple de la Terre");
		discipleDaLaTerre.setVoie("Voie de la Terre");
		discipleDaLaTerre.setCasteLie(elementalistes);
		discipleDaLaTerre.setDescription(
				"Le culte de la Terre est l’un des plus déroutants. Intégrant dans son dogme le cycle des Trihns, il offre à ses adeptes une vision du monde globale peu accessible aux autres. Le relativisme et le fatalisme dont font preuve les disciples de Ling les place toujours en décalage de ce qui est communément admis. En prise directe avec l’insondable et les forces telluriques, les adeptes de la Terre font souvent preuve d’une grande détermination. Ils voient ce que les autres ne peuvent voir, comme si la terre et tout ce qu’elle avait accumulé depuis toujours était en prise directe avec leur âme...");
		discipleDaLaTerre = metierRepository.save(discipleDaLaTerre);

		discipleDesLimbes.setNomMetier("Disciple des Limbes");
		discipleDesLimbes.setVoie("Voie des Limbes");
		discipleDesLimbes.setCasteLie(elementalistes);
		discipleDesLimbes.setDescription(
				"Le culte des Limbes est le plus décrié car le plus ambigüe. Car si certains disciples prétendent pratiquer ce culte pour mieux comprendre les Limbes de l’intérieur et pouvoir ainsi mieux les combattre, il n’empêche que cette voie est surtout pratiquée en majorité par les Nécrosiens. Le contact direct avec les névroses les plus abyssales laissent souvent des séquelles aux adeptes de Gargan. Et si tous ne finissent pas nécrosés, c’est que ceux qui restent du «bon côté» sont devenus fous... S’engager sur la voie des Limbes, c’est être sur le fil du rasoir, on peut basculer à tout moment...");
		discipleDesLimbes = metierRepository.save(discipleDesLimbes);

		discipleDuFeu.setNomMetier("Disciple du Feu");
		discipleDuFeu.setVoie("Voie du Feu");
		discipleDuFeu.setCasteLie(elementalistes);
		discipleDuFeu.setDescription(
				"Le culte du Feu exalte les passions et les conflits. Brûlant tout sur son passage, le disciple du Feu plie ses adversaires à sa volonté. Il s'enflamme pour un rien et ne recule devant rien pour atteindre ses objectifs. Ayant soif de conquêtes et de renommée, le disciple du Feu n’hésite jamais à provoquer les événements plutôt que de les subir. Assez à l’aise dans le chaos, il n’apprécie guère le consensus et peut parfois faire preuve d’esprit de contradiction, par simple plaisir d’en découdre... Les Guerriers, les Sorciers et les Ensorceleurs sont bien en phase avec cette voie.");
		discipleDuFeu = metierRepository.save(discipleDuFeu);

		discipleDuMoi.setNomMetier("Disciple du Moi");
		discipleDuMoi.setVoie("Voie du Moi");
		discipleDuMoi.setCasteLie(elementalistes);
		discipleDuMoi.setDescription(
				"Le culte du Moi est assez singulier. En effet, les disciples ne peuvent compter que sur eux-mêmes pour progresser dans leur voie. Cette dernière, faite de frustration et de solitude a tendance à couper ses adeptes du reste du monde. Égotique et orgueilleux, les adeptes du Moi nourrissent un véritable complexe de supériorité. Ils se plaisent à répéter à qui veut l’entendre qu’ils se sont faits tout seuls... Les Magiciens apprécient particulièrement ce culte qu’ils trouvent en phase avec leurs préoccupations.");
		discipleDuMoi = metierRepository.save(discipleDuMoi);

		discipleDuVegetal.setNomMetier("Disciple du Végétal");
		discipleDuVegetal.setVoie("Voie du Végétal");
		discipleDuVegetal.setCasteLie(elementalistes);
		discipleDuVegetal.setDescription(
				"Le culte du Végétal est l’un des plus pacifistes. Entièrement dédié à la connaissance et au culte de la transmission du savoir, il est la sève de la culture héossienne. Les disciples de Wän sont de ceux qui bâtissent des bibliothèques, impriment des livres et construisent des écoles afin de communiquer aux générations futures le fruit de leur pensée. Car les disciples du Végétal voient toujours les choses à long terme, à très long terme même, c’est ce qui les rend si sages et si respectables. Mais le végétal peut aussi se révéler empoisonné et produire des parasites. Cette voie obscure qui conduit au machiavélisme et à la folie reste heureusement assez marginale...");
		discipleDuVegetal = metierRepository.save(discipleDuVegetal);

		athlete.setNomMetier("Athlète");
		athlete.setVoie("Voie du Feu");
		athlete.setCasteLie(voyageurs);
		athlete.setDescription(
				"Les Athlètes parcourent l’Héossie à la recherche de défis à relever et pour participer aux nombreux tournois qui sont organisés tout au long de l’année dans les différentes régions. Course, nage, saut d’obstacle, lancer de disque, de pierre, usage de force ou d’adresse, toutes les disciplines sont représentées et ont leurs champions. Les Athlètes sont la plupart du temps sponsorisés par des Castes ou des Guildes locales. Selon leur niveau ils peuvent prétendre à des salaires plus ou moins importants. Certains Athlètes, dont les mécènes sont de puissants Notables ou des Grandes Familles, ont des salaires mirobolants et une notoriété écrasante. L’Athlète ne lâche jamais prise, contre vents et marées, il sait faire face à tous les obstacles. Grâce à leur mental en acier trempé, les Athlètes à la retraite sont souvent amenés à exercer de hautes responsabilités au sein de diverses Guildes.");
		athlete = metierRepository.save(athlete);

		caravanier.setNomMetier("Caravanier");
		caravanier.setVoie("Voie de l'Objet");
		caravanier.setCasteLie(voyageurs);
		caravanier.setDescription(
				"Le Caravanier sillonne les terres héossiennes pour y transporter toutes sortes de marchandises. Les caravanes intègrent souvent des troupeaux de bêtes de somme qui servent de garde-manger, ou d’animaux de rechange pour tracter les gigantesques roulottes à plusieurs étages, véritables bâtisses ambulantes disposant de tout le confort urbain, y compris eau courante, chauffage, système de cuisson et système réfrigérant grâce au réseau de Trihnite domestique. Les caravanes peuvent être constituées de quelques roulottes à plusieurs centaines, donnant à de tels convois des allures de villes nomades. Les caravanes peuvent prendre de nombreuses formes, des frégates de gigantesques navires à ski sillonnant les glaces, aux cohortes de carrioles à plusieurs étages, tirées par des insectes géants traversant les hautes herbes.");
		caravanier = metierRepository.save(caravanier);

		chasseur.setNomMetier("Chasseur");
		chasseur.setVoie("Voie du Moi");
		chasseur.setCasteLie(voyageurs);
		chasseur.setDescription(
				"Ne faire qu'un avec sa proie, sentir la respiration de l'arbre, telles sont les pensées du Chasseur qui sait faire Corps avec la nature et lire tous les signes qui peuvent lui permettre de se fondre en elle. Très respectueux de ce qui l'entoure, il connait sa place au sein des règnes animal et végétal. C'est ce qui lui donne un avantage décisif sur sa proie. Capable de rester immobile pendant des heures, puis de fondre sur sa cible à la vitesse de l'éclair, le Chasseur reste un instinctif qui parle peu mais agit efficacement. Peu à l'aise dans les villes, le Chasseur se satisfait de peu, un feu de camp, une tente, une brochette et c'est le nirvana....");
		chasseur = metierRepository.save(chasseur);

		eclaireur.setNomMetier("Eclaireur");
		eclaireur.setVoie("Voie de la Terre");
		eclaireur.setCasteLie(voyageurs);
		eclaireur.setDescription(
				"Les Éclaireurs sont ceux qui ouvrent de nouvelles routes commerciales, tracent de nouveaux itinéraires et découvrent des territoires inconnus. Toujours sur le qui-vive, à l'écoute du moindre danger, ils savent identifier les signes qu'ils ne connaissent pas pour garder toujours un temps d’avance sur d'éventuels agresseurs. Le voyageur dispose d'une excellente mémoire visuelle, qui lui permet de repérer très vite un détail incongru ou une variation subtile de l'environnement.");
		eclaireur = metierRepository.save(eclaireur);

		espion.setNomMetier("Espion");
		espion.setVoie("Voie de l'Air");
		espion.setCasteLie(voyageurs);
		espion.setDescription(
				"De tous temps, les Espions ont toujours été nécessaires pour obtenir des informations qu’il aurait été impossible d’obtenir autrement… Être invisible, se fondre dans les ombres, se déplacer en silence, telles sont les aptitudes de l’Espion qui lui permettent d’aller où il veut sans attirer l’attention. Même au sein d’un groupe, l’Espion cultive l’art de la discrétion, il reste toujours celui que l’on ne voit pas ou que l’on oublie sitôt avoir été vu… Avec l'arrivée des humains et de leur technologie de repérage très sophistiquée, la tache de l'Espion s'est relativement complexifiée, car l'on ne pénètre pas de la même façon dans une forteresse héossienne que dans un complexe industriel d'une Grande Famille. Certains Espions ont ainsi dû apprendre la magie ou s'équiper de brouilleurs sensitifs afin de pouvoir s'acquitter de leur mission dans de meilleures conditions.");
		espion = metierRepository.save(espion);

		guide.setNomMetier("Guide");
		guide.setVoie("Voie du Végétal");
		guide.setCasteLie(voyageurs);
		guide.setDescription(
				"Les Guides disposent d’une culture héossienne hors du commun et leur sens inné de la géopolitique leur permet de voyager en évitant les zones sensibles. Connaître l’histoire des peuples et les us et coutumes de chaque race reste le meilleur moyen de ne pas faire d’impairs lorsqu’une situation conflictuelle se présente. Les Guides sont intarissables sur ce qu’ils connaissent mais ont parfois tendance à submerger d’informations leurs interlocuteurs.");
		guide = metierRepository.save(guide);

		messager.setNomMetier("Messager");
		messager.setVoie("Voie de l'Animal");
		messager.setCasteLie(voyageurs);
		messager.setDescription(
				"Cavalier émérite, le Messager change de monture comme d'autres de chemise, afin d'avoir toujours une bête qui soit au maximum de ses capacités pour être la plus rapide possible. La mise en place des réseaux de portes de transferts n'a jamais amoindri la tâche des Messagers, car si les distances ont été raccourcies et que la communication entre les grandes villes se fait relativement facilement, il en va tout autrement dès qu'il faut s'aventurer dans les provinces héossiennes, où des cités perdues dans des coins reculés sont menacées par l'isolement.");
		messager = metierRepository.save(messager);

		navigateur.setNomMetier("Navigateur");
		navigateur.setVoie("Voie de l'Eau");
		navigateur.setCasteLie(voyageurs);
		navigateur.setDescription(
				"Les voies maritimes ont toujours été privilégiées aux voies terrestres, plus dangereuses en raison des nombreux aléas qui peuvent survenir : animaux sauvages, brigands, nécrosiens, catastrophes naturelles… Certes la mer et les océans comportent leur lot de grands dangers, mais les Navigateurs émérites savent les contourner et les anticiper... De plus les mers n'ont jamais été investies par les Humains, ce qui en a toujours fait un espace de liberté absolu.");
		navigateur = metierRepository.save(navigateur);

		traqueurDeStele.setNomMetier("Traqueur de stèle");
		traqueurDeStele.setVoie("Voie des Limbes");
		traqueurDeStele.setCasteLie(voyageurs);
		traqueurDeStele.setDescription(
				"Les Traqueurs de stèle sont extrêmement recherchés à travers toute l'Héossie, car leur connaissance des emplacements de stèle d'Embiose peut permettre à n'importe qui de devenir rapidement très puissant, rien qu'en suivant un parcours ayant ces stèles comme étapes initiatiques. Deux archétypes de Traqueur de stèle prédominent : le guide et l'expérimenteur. Le guide se contente d'amener ses clients sur les différents sites qu'il connaît en mettant à profit sa connaissance de la culture nécrosienne pour éviter les mauvaises rencontres ou savoir temporiser le cas échéant. L'expérimenteur est quant à lui d'une nature plus solitaire, voir égotique et poursuit une quête de pouvoir absolu, de perfection. En raison de sa frénésie, l'expérimenteur finit tôt ou tard par se nécroser. Tout dépend alors de sa force de caractère. Certains réussissent à revenir dans le monde du vivant, d'autres se perdent à jamais dans les ténèbres...");
		traqueurDeStele = metierRepository.save(traqueurDeStele);

		voltigeur.setNomMetier("Voltigeur");
		voltigeur.setVoie("Voie de l'Autre");
		voltigeur.setCasteLie(voyageurs);
		voltigeur.setDescription(
				"Le Voltigeur se met au service des autres, il fait ce que personne ne peut faire et va là où personne ne va... Qu'il s'agisse de glisser sur une voilure pour récupérer un outil malencontreusement perdu, escalader un mât, se faufiler sous une roulotte en mouvement pour réparer une courroie de transmission, ou encore d'aller calmer une bête de trait enragée en devant sauter par-dessus toutes les autres, le Voltigeur est toujours prêt... Un peu hommes à tout faire, les Voltigeurs sont très prisés par les autres Voyageurs et les membres des autres castes qui apprécient beaucoup leur serviabilité et leur débrouillardise...");
		voltigeur = metierRepository.save(voltigeur);

		archer.setNomMetier("Archer");
		archer.setVoie("Voie de l'Air");
		archer.setCasteLie(combattants);
		archer.setDescription(
				"Les Archers sont craints à travers toute l'Héossie car leur arme de prédilection ne se limite pas à l'arc, mais à toutes les armes de tir permettant d'envoyer un projectile à grande vitesse sur une cible éloignée. Lors des affrontements de masse, ce sont souvent les bataillons d'archers qui font la différence...");
		archer = metierRepository.save(archer);

		armimalier.setNomMetier("Armimalier");
		armimalier.setVoie("Voie de l'Animal");
		armimalier.setCasteLie(combattants);
		armimalier.setDescription(
				"À la fois dresseur et éleveur, les Armimaliers parcourent le monde à la recherche de nouvelles créatures et de nouvelles capacités. Une fois cela trouvé, il faut pouvoir former des couples afin de perpétuer l'espèce. La difficulté réside ensuite dans le fait de mettre l'armimale en phase avec son propriétaire. Certaines créatures sont plus dociles que d'autres et acceptent de changer de propriétaire facilement, tandis que d'autres ne veulent qu'un seul lien pour toute leur vie.\r\n"
						+ "Mais la plus grande occupation des Armimaliers consiste à faire des croisements d'espèces afin d'obtenir de nouvelles capacités. Malheureusement les échecs sont bien plus nombreux que les réussites.");
		armimalier = metierRepository.save(armimalier);

		artilleur.setNomMetier("Artilleur");
		artilleur.setVoie("Voie des Limbes");
		artilleur.setCasteLie(combattants);
		artilleur.setDescription(
				"Combattant spécialisé dans les sièges et le maniement des engins de guerre, l'Artilleur est à la fois pilote, ingénieur et tacticien. Il sait évaluer les trajectoires, calculer les distances, et les points faibles des murailles pour optimiser l'efficacité de ses tirs. Il n'aime pas se battre contre des individus et préfère se confronter à la résistance des matériaux, des bâtiments et des véhicules.");
		artilleur = metierRepository.save(artilleur);

		fantassin.setNomMetier("Fantassin");
		fantassin.setVoie("Voie de l'Eau");
		fantassin.setCasteLie(combattants);
		fantassin.setDescription(
				"Les fantassins, sont un corps d'armée principalement composée de laisser-pour-compte et autres rebuts de la société humaine. En première ligne, ils sont peu armées pour des raisons budgétaires et partent au front sans grand espoir de retour. Leur seule chance de pouvoir survivre quelques heures au combat réside dans leur capacité à esquiver les attaques ennemies. Toujours sur le qui-vive, le fantasin, tel un animal traqué sursaute en permanence dès qu'un bruit incongru, même imperceptible, se produit. Les yeux grands ouverts afin de ne jamais être surpris, l'oreille tendue, ils ne dorment peu tant leur nervosité les empêche de s'abandonner au sommeil. Bourrés de tics, ils ont un rapport à l'autre compliqué car leur paranoïa naturelle leur fait interpréter le moindre geste anodin pour une attaque préméditée. Ainsi, il est fréquent de voir un fantassin plonger au sol simplement parce qu'on lui tend la main pour le saluer...");
		fantassin = metierRepository.save(fantassin);

		francTireur.setNomMetier("Franc-tireur");
		francTireur.setVoie("Voie de l'Objet");
		francTireur.setCasteLie(combattants);
		francTireur.setDescription(
				"Les Francs-tireurs ont développé toutes sortes de techniques pour se battre avec des armes de lancer, afin de maintenir leurs adversaires à distance. Certaines armes qui ont la capacité de revenir dans la main après avoir été projetées peuvent s'avérer très dangereuses dans des mains expertes...");
		francTireur = metierRepository.save(francTireur);

		gardeMine.setNomMetier("Garde-mine");
		gardeMine.setVoie("Voie de la Terre");
		gardeMine.setCasteLie(combattants);
		gardeMine.setDescription(
				"Habitués à se battre en sous-sol et dans des espaces confinés, ces Combattants des tunnels ont pris l'habitude de se battre sans arme pour ne pas être gênés dans leur mouvements. Ils ont ainsi développé toutes sortes de techniques de poings, de pieds et de projection afin de venir à bout de n'importe quel adversaire. Les Garde-mines sont réputés pour vaincre des Gargans à mains nues, avec leur fameuse technique du «poing de pierre»...");
		gardeMine = metierRepository.save(gardeMine);

		gardienDesForets.setNomMetier("gardienDesForets");
		gardienDesForets.setVoie("Voie de Végétal");
		gardienDesForets.setCasteLie(combattants);
		gardienDesForets.setDescription(
				"Se battre dans une forêt sans être gêné par les racines, les branches mortes, les mousses glissantes et toutes sortes de pièges imprévisibles a donné aux Gardiens des forêts une véritable expertise pour savoir utiliser les particularités du terrain à leur avantage... De fait, un Gardien des forêts saura toujours comment se placer par rapport à son adversaire pour optimiser ses prises et réduire ses ouvertures.");
		gardienDesForets = metierRepository.save(gardienDesForets);

		gladiateur.setNomMetier("Gladiateur");
		gladiateur.setVoie("Voie du Feu");
		gladiateur.setCasteLie(combattants);
		gladiateur.setDescription(
				"Le Gladiateur est archétype du guerrier rompu au maniement des épées, des glaives, des haches et de tout type d'arme de mêlée. Habitué à gérer ses montées d'adrénaline avant un combat d'arène, il sait rester maître de lui et se laisse rarement impressionner. Les Gladiateurs sont les combattants les plus redoutés, à juste titre car ce sont souvent les plus meurtriers. Le Gladiateur aime se battre, il aime provoquer les autres afin de les provoquer en duel. Car ce qui anime un Gladiateur c'est d'être le meilleur combattant que l'Histoire ait connu. Les Gladiateurs veulent devenir des légendes et pour cela, ils sont prêts à braver tous les dangers, parfois même de façon inconsidérée.");
		gladiateur = metierRepository.save(gladiateur);

		protecteur.setNomMetier("Protecteur");
		protecteur.setVoie("Voie de l'Autre");
		protecteur.setCasteLie(combattants);
		protecteur.setDescription(
				"Ces gardes du corps sont recherchés pour leur connaissance des gens et leur sens de la psychologie. Souvent utilisés comme gardes, comme videurs ou comme hommes de main, les Protecteurs se targuent de n'avoir jamais besoin de combattre. Trouvant instinctivement la faille psychologique de leurs adversaires, ils savent d'un regard, d'un geste ou d'un mot refroidir les ardeurs belliqueuses. Sachant user de tact pour résoudre les conflits, ils savent tout aussi bien faire preuve de force si la situation l'exige.");
		protecteur = metierRepository.save(protecteur);

		soldat.setNomMetier("Soldat");
		soldat.setVoie("Voie du Moi");
		soldat.setCasteLie(combattants);
		soldat.setDescription(
				"Le Soldat est un homme de terrain, habitué à vivre à la dure, sans confort et sans ménagement. Obéissant, il est au service de sa hiérarchie et offre sa vie à la cause qu’il sert. Il vit souvent en collectivité, mais mène son combat intérieur en solitaire, tiraillé entre ses doutes et ses convictions. L’entraînement des Soldats est intense et très dur, au point que même le plus gringalet est amené à devenir une montagne de muscles. Cette force, acquise par l’expérience et le travail, leur permet d’avoir un avantage décisif en combat.");
		soldat = metierRepository.save(soldat);

		artificier.setNomMetier("Artificier");
		artificier.setVoie("Voie du Feu");
		artificier.setCasteLie(ombres);
		artificier.setDescription(
				"L'Artificier est un pyromane fasciné par le feu et les explosions. Il démarre au quart de tour et a tendance à vouloir tout brûler autour de lui. D'un tempérament suicidaire, il brûle la vie par les deux bouts et agit souvent avant de réfléchir. Il s'emporte pour un rien et peut, par excès de colère, commettre des bavures. Pour toutes ces raisons, l'Artificier suscite la crainte autour de lui car il a la réputation d'être totalement incontrôlable et surtout extrêmement destructeur.");
		artificier = metierRepository.save(artificier);

		ensorceleur.setNomMetier("Ensorceleur");
		ensorceleur.setVoie("Voie des Limbes");
		ensorceleur.setCasteLie(ombres);
		ensorceleur.setDescription(
				"L'Ensorceleur reste le métier le plus craint des Héossiens. Pourchassant leurs cibles jusque dans leur sommeil, ils vivent entre deux mondes où réel et imaginaire ne font qu'un...Même s'il n'est pas nécrosé, l'Ensorceleur en prend tous les aspects psychologiques, paranoïa, égocentrisme, stress et colères incontrôlables. Profondément névrotique, il a du mal à trouver sa place, nécrosien pour les Anthéens et anthéen chez les Nécrosiens. Pour cette raison, les Ensorceleurs finissent par se nécroser d'eux-mêmes afin d'avoir enfin une place dans la société...");
		ensorceleur = metierRepository.save(ensorceleur);

		escroc.setNomMetier("Escroc");
		escroc.setVoie("Voie de l'Autre");
		escroc.setCasteLie(ombres);
		escroc.setDescription(
				"L'Escroc se sent comme un poisson dans l'eau au sein du pouvoir humain. Il monte de nombreuses affaires pour exploiter des Héossiens et même des Humains afin de faire le maximum de profit avec le minimum de dépenses. Adepte des passe-droits, il graisse la patte de tous ceux qui tiennent une place stratégique au sein des rouages de la mécanique administrative humaine. Il arrive toujours à ses fins et ne supporte pas la contradiction. Car l'Escroc se sent invulnérable, doté d'une essence divine, il achète ses ennemis, vend ses alliés et veut devenir maître du monde. Mais l'Escroc finit toujours ses jours seul, ignoré de tous...");
		escroc = metierRepository.save(escroc);

		faussaire.setNomMetier("Faussaire");
		faussaire.setVoie("Voie de la Terre");
		faussaire.setCasteLie(ombres);
		faussaire.setDescription(
				"Le Faussaire est un artiste frustré qui s'exprime dans le contournement des lois et la réalisation de faux documents en vue de tromper la vigilance des administrations ou d'un système social. Capable de reproduire à la perfection des sceaux officiels, des laissez-passer, des faux papiers mais également des cartes numériques d'identification personnelle, ou des fausses clés, il peut permettre à des voleurs de forcer n'importe quel système de sécurité. Très matérialiste, le faussaire est quelqu'un de rationnel qui déteste les imprévus.");
		faussaire = metierRepository.save(faussaire);

		geneticien.setNomMetier("Généticien");
		geneticien.setVoie("Voie du Végétal");
		geneticien.setCasteLie(ombres);
		geneticien.setDescription(
				"Les Généticiens sont tous un peu fêlés. Véritables savants fous, ils aiment mener des expérimentations douteuses sur la matière vivante... Ils travaillent sur les morphes qu'ils essayent d'adapter aux nouvelles fonctions que requièrent les nouvelles technologies. La miniaturisation des morphes restent le graal des généticiens.");
		geneticien = metierRepository.save(geneticien);

		mitrailleur.setNomMetier("Mitrailleur");
		mitrailleur.setVoie("Voie de l'Objet");
		mitrailleur.setCasteLie(ombres);
		mitrailleur.setDescription(
				"Le Mitrailleur est un maître d'armes entraîné à manier toutes les armes technologiques humaines, du simple pistolet à décharge au canon à ondes embarqué. Il sait aussi utiliser les armures et autres boucliers énergétiques qui lui permettent de se prémunir de tous types d'attaques. Obsessionnel, le Mitrailleur entretient une relation assez malsaine avec ses armes. Pour lui, elles sont dotées de personnalités féminines auxquelles il se plaît à confier ses états d'Âmes. Perdre une arme pour un Mitrailleur est une blessure considérable, comme s'il avait perdu un être cher. D'un profil psychologique assez déséquilibré, le Mitrailleur est souvent en proie à de nombreuses perversions qui l'empêchent d'avoir une perception rationnelle de tout ce qui l'entoure.");
		mitrailleur = metierRepository.save(mitrailleur);

		necromant.setNomMetier("Nécromant");
		necromant.setVoie("Voie du Moi");
		necromant.setCasteLie(ombres);
		necromant.setDescription(
				"Les Nécromants sont des magiciens des Limbes qui peuvent invoquer des âmes nécrosées, qu'ils utilisent ensuite comme combustible pour créer de puissants tourments. Très dangereux et redoutés à juste titre, ils sèment la terreur dès qu'ils apparaissent. Les Héossiens sont pétrifiés lorsqu'ils sont en présence de Nécromants et ces derniers abusent de cette emprise pour assouvir leurs noirs desseins... Les Nécromants ont très vite su se faire une place de choix au sein de la théocratie humaine et ont beaucoup œuvré pour la persécution des Shaanistes et des Magiciens.");
		necromant = metierRepository.save(necromant);

		trafiquant.setNomMetier("Trafiquant");
		trafiquant.setVoie("Voie de l'Air");
		trafiquant.setCasteLie(ombres);
		trafiquant.setDescription(
				"Le Trafiquant peut prendre de nombreux visages, du petit escroc sans envergure qui tente de revendre des marchandises prohibées, au caïd à la tête de nombreux réseaux d'économie parallèle où trafics d'esclaves, vente de produits pharmaceutiques périmés, drogues dures et prostitution sauvage sont légion. Généralement affilié à l'Ombre, le Trafiquant doit toujours des comptes à un Trafiquant plus influent que lui. Il évolue principalement en milieu urbain, dont il connaît tous les codes sociaux et maîtrise toute la géopolitique liée aux gangs et aux divers réseaux d'influence locaux. Les modes changent très vite au sein des cités et il est difficile de se tenir toujours à la page pour ne pas paraître hors propos. De plus, d'une ville à l'autre ces codes peuvent changer du tout au tout...");
		trafiquant = metierRepository.save(trafiquant);

		voleur.setNomMetier("Voleur");
		voleur.setVoie("Voie de l'eau");
		voleur.setCasteLie(ombres);
		voleur.setDescription(
				"Le Voleur est capable de dérober n'importe quoi à l'insu de n'importe qui et ce, n'importe où. Tout est affaire de préparation, de repérage et de psychologie. Le reste n'est qu'une question de doigter. Le Voleur sait s'adapter à la technologie qui lui fait face, de la neutralisation du piège déclenché par une dalle, à la caméra de surveillance qu'il faut mettre hors circuit. Expert en pickpocket, le Voleur a également une bonne connaissance des jeux de hasard et de stratégie et surtout du meilleur moyen de tricher sans éveiller les soupçons. Toujours sur le qui-vive, le Voleur fait tout pour canaliser ses pulsions d'adrénaline afin que son esprit soit toujours aussi calme que l'eau d'un lac.");
		voleur = metierRepository.save(voleur);

		voyou.setNomMetier("Voyou");
		voyou.setVoie("Voie de l'Animal");
		voyou.setCasteLie(ombres);
		voyou.setDescription(
				"Les Voyous arpentent les Cités à la recherche de proies potentielles. Passés maîtres dans l’art du Harcèlement, ils savent utiliser toutes les techniques permettant de déstabiliser et de nécroser une cible en la giflant, lui crachant dessus, la bousculant et en lui faisant perdre tous ses moyens. Les voyous infiltrent également les Guildes, au sein desquelles ils se plaisent à harceler leurs subalternes.");
		voyou = metierRepository.save(voyou);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	
		engrenages.setDescription(
				"Manipuler des petits mécanismes tels que serrures ou horloges. Poser et désarmocer des pièges complexes. Comprendre les systèmes à engrenages et poulies, mais également les machines à vapeur.");
		engrenages.setNom("Engrenages");
		engrenages.setDomaineLie(technique);
		engrenages.setMetier(mecaniste);
		engrenages = specialisationRepository.save(engrenages);

		pilotage.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		pilotage.setNom("Pilotage");
		pilotage.setDomaineLie(technique);
		pilotage.setMetier(pilote);
		pilotage = specialisationRepository.save(pilotage);

		recuperation.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		recuperation.setNom("Récupération");
		recuperation.setDomaineLie(technique);
		recuperation.setMetier(recuperateur);
		recuperation = specialisationRepository.save(recuperation);

		sensDeLaPierre.setDescription(
				"Construire des murs, des ponts, des sols et des routes. Préparer de la trihnite pour en faire des portes de transfert. Connaître le modelage, la taille de pierre et l'architecture. Situer les sites riches en roche, en trihnite et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un bâtiment ou d'une caverne.");
		sensDeLaPierre.setNom("Sens de la pierre");
		sensDeLaPierre.setDomaineLie(technique);
		sensDeLaPierre.setMetier(batisseur);
		sensDeLaPierre = specialisationRepository.save(sensDeLaPierre);

		sensDuBois.setDescription(
				"Fabriquer du mobilier, du papier, de la corde, des bateaux, des charpentes. Connaître la menuiserie, la charpenterie, la papeterie, la découpe et le traitement du bois pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un bateau, d'un meuble, d'un plancher.");
		sensDuBois.setNom("Sens du bois");
		sensDuBois.setDomaineLie(technique);
		sensDuBois.setMetier(charpentier);
		sensDuBois = specialisationRepository.save(sensDuBois);

		sensDuCuir.setDescription(
				"Confectionner des sacs, des armures en cuir, des lanières, des chaussures, des sièges. Connaître la tannerie, la zoologie et le traitement de la peau d'un animal pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce de cuir.");
		sensDuCuir.setNom("Sens du cuir");
		sensDuCuir.setDomaineLie(technique);
		sensDuCuir.setMetier(tanneur);
		sensDuCuir = specialisationRepository.save(sensDuCuir);

		sensDuMetal.setDescription(
				"Fabriquer des engrenages, des armes, des armures et des pièces mécaniques. Connaître la métallurgie et l'armurerie. Situer les sites riches en métaux et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce en métal.");
		sensDuMetal.setNom("Sens du metal");
		sensDuMetal.setDomaineLie(technique);
		sensDuMetal.setMetier(forgeron);
		sensDuMetal = specialisationRepository.save(sensDuMetal);

		sensDuTissu.setDescription(
				"Tisser des vêtements, des voiles pour les bateaux, des coussins, des draps, des tapis. Connaître le tissage, le stylisme et le traitement du coton ou de la soie pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'une étoffe ou d'une voile.");
		sensDuTissu.setNom("Sens du tissu");
		sensDuTissu.setDomaineLie(technique);
		sensDuTissu.setMetier(couturier);
		sensDuTissu = specialisationRepository.save(sensDuTissu);

		sensDuVerre.setDescription(
				"Façonner des bijoux, des outils, des fioles, mais aussi des armes, des artefacts, des loupes, des miroirs, des lunettes et des écrans. Connaître l’orfèvrerie. Apprécier la qualité, la valeur et la résistance d'un bijou, d'une fiole...");
		sensDuVerre.setNom("Sens du verre");
		sensDuVerre.setDomaineLie(technique);
		sensDuVerre.setMetier(joaillier);
		sensDuVerre = specialisationRepository.save(sensDuVerre);

		technologie.setDescription(
				"Connaître les sources d'énergie et leurs applications pour faire fonctionner un appareil régi par la technologie humaine. Construire ou réparer une arme à feu, un moteur de véhicule, un appareil électronique, etc. Composer des programmes informatiques en \"Code Note\" qui tournent sur le rézo Arpège (logiciels, interfaces, virus, démons, espions, lutins, judas, cryptographie...)");
		technologie.setNom("Technologie");
		technologie.setDomaineLie(technique);
		technologie.setMetier(infotek);
		technologie = specialisationRepository.save(technologie);

		alchimie.setDescription(
				"Connaître les éléments de base qui constituent la matière et les forces qui agissent entre eux. Analyser la nature d'un matériau et en déduire ce qu'il faut pour le creuser, le percer, le briser, le faire fondre, le rendre friable, en un mot, changer son état...");
		alchimie.setNom("Alchimie");
		alchimie.setDomaineLie(savoir);
		alchimie.setMetier(alchimiste);
		alchimie = specialisationRepository.save(alchimie);

		bibliotheque.setDescription(
				"Savoir tirer le meilleur d’une source conséquente de documents pour obtenir des informations sur un sujet précis.");
		bibliotheque.setNom("Bibliotheque");
		bibliotheque.setDomaineLie(savoir);
		bibliotheque.setMetier(archiviste);
		bibliotheque = specialisationRepository.save(bibliotheque);

		botanique.setDescription(
				"Connaître le règne végétal terrestre et marin, ainsi que toutes les variétés de champignons. Reconnaître les végétaux empoisonnés des comestibles. Confectionner des cataplasmes et autres mixtures aux facultés curatives dont les effets dépendent des végétaux et de leurs propriétés.");
		botanique.setNom("Botanique");
		botanique.setDomaineLie(savoir);
		botanique.setMetier(botaniste);
		botanique = specialisationRepository.save(botanique);

		cultureHumaine.setDescription(
				"Connaître la vie et les mœurs des Humains, mais aussi leur technologie. Avoir une idée de la puissance du Nouvel Ordre et du pouvoir qu’exercent les Grandes Familles. Savoir lire et écrire le Langdiv");
		cultureHumaine.setNom("Culture Humaine");
		cultureHumaine.setDomaineLie(savoir);
		cultureHumaine.setMetier(percepteur);
		cultureHumaine = specialisationRepository.save(cultureHumaine);

		esoterisme.setDescription(
				"Consulter les astres à l'aide de tarots, d'osselets, de dés, de plateaux de divination, ou même dans le cercle des réalités pour percer les secrets du temps, des lieux et des individus. L'ésotérisme peut constituer un refuge contre les agressions mentales.");
		esoterisme.setNom("Esoterisme");
		esoterisme.setDomaineLie(savoir);
		esoterisme.setMetier(esoteriste);
		esoterisme = specialisationRepository.save(esoterisme);

		geologie.setDescription(
				"Connaître l'histoire de la formation des gouffres et des montagnes, des volcans et des séismes. Évaluer la constitution d'un sol et l'énergie que l'on peut en tirer. Cette Spécialisation est également utilisée pour l'archéologie");
		geologie.setNom("Geologie");
		geologie.setDomaineLie(savoir);
		geologie.setMetier(geologue);
		geologie = specialisationRepository.save(geologie);

		histoireDHeos.setDescription(
				"Connaître l'histoire générale d’Héos, mais aussi les contes, légendes et mythes existants, qui relatent les épopées d'êtres imaginaires, des dieux de l'ancien panthéon ou de héros ayant réellement vécu en Héossie. Connaître les flux migratoires, les grandes guerres et l'évolution des civilisations.");
		histoireDHeos.setNom("Histoire d'Héos");
		histoireDHeos.setDomaineLie(savoir);
		histoireDHeos.setMetier(historien);
		histoireDHeos = specialisationRepository.save(histoireDHeos);

		medecine.setDescription(
				"Diagnostiquer une maladie. Procéder à des opérations chirurgicales. Connaître parfaitement l'anatomie anthéenne. Savoir quel antidote correspond à chaque poison, sa composition et son mode de fabrication. Soigner le Corps d'une personne atteinte de maladie, d'une intoxication ou qui a subi des blessures physiques.");
		medecine.setNom("Médecine");
		medecine.setDomaineLie(savoir);
		medecine.setMetier(medecin);
		medecine = specialisationRepository.save(medecine);

		protocoles.setDescription(
				"Connaître les diverses formes de gouvernement, ainsi que les lois régissant administration et pouvoir. Mettre en place les procédures pour accéder à n’importe quel tribunal ou obtenir des laissez-passer. Être à l’aise avec la paperasse qui va avec. Fait également office de Diplomatie vis à vis de cultures inconnues.");
		protocoles.setNom("Protocoles");
		protocoles.setDomaineLie(savoir);
		protocoles.setMetier(juriste);
		protocoles = specialisationRepository.save(protocoles);

		zoologie.setDescription(
				"Connaître le règne animal, de la cellule aux mammifères, en passant par les poissons, les insectes et les oiseaux. Connaître les divers écosystèmes qui régissent un lieu, les modes de vie des diverses espèces qui le peuplent, ainsi que les propriétés des organes des animaux.");
		zoologie.setNom("Zoologie");
		zoologie.setDomaineLie(savoir);
		zoologie.setMetier(zoologue);
		zoologie = specialisationRepository.save(zoologie);

		arpege.setDescription(
				"Naviguer sur le rézo Arpège en utilisant une console dotée d'une interface graphique. Connaître ce monde virtuel tentaculaire de l'information et de la communication. Maîtriser les logiciels de capture et de restitution d'images 2D ou 3D pour réaliser des trucages et effets spéciaux. Forcer certains barrages informatiques pour obtenir des données confidentielles. Utiliser des logiciels pour composer des programmes compilés en lignes de notes.");
		arpege.setNom("Arpege");
		arpege.setDomaineLie(social);
		arpege.setMetier(cyberien);
		arpege = specialisationRepository.save(arpege);

		bluff.setDescription(
				"Mentir ou baratiner quelqu'un. L’effet d’un bluff est en général temporaire, la victime mettra quelques minutes à se rendre compte qu'elle s’est fait berner.");
		bluff.setNom("Bluff");
		bluff.setDomaineLie(social);
		bluff.setMetier(politicien);
		bluff = specialisationRepository.save(bluff);

		commerce.setDescription(
				"Marchander. Estimer des objets de valeur. Acheter les services de quelqu’un. Connaître le niveau de rareté d'un Acquis à un endroit donné et donc les fluctuations des prix du marché en fonction de la localité.");
		commerce.setNom("Commerce");
		commerce.setDomaineLie(social);
		commerce.setMetier(marchand);
		commerce = specialisationRepository.save(commerce);

		diplomatie.setDescription(
				"Savoir faire passer ses idées en douceur. Réussir à détendre un climat tendu. Négocier des traités entre deux belligérants. Parler à un auditoire en faisant preuve d'éloquence. Chercher à convaincre un interlocuteur grâce à des arguments cohérents. Calmer des personnes hostiles. Avoir une idée des divers conflits qui peuvent tourmenter une région. Connaître le rang de quelqu'un dans n'importe quel milieu social, du plus élevé au plus primitif. Savoir comment se comporter pour ne pas commettre d'impairs, même si on ne parle pas la langue.");
		diplomatie.setNom("Diplomatie");
		diplomatie.setDomaineLie(social);
		diplomatie.setMetier(diplomate);
		diplomatie = specialisationRepository.save(diplomatie);

		enseignement.setDescription(
				"Enseigner une Spécialisation à une autre personne. Faire preuve de pédagogie. Mettre en place un programme d’apprentissage. Apprendre plus vite d’un autre enseignant.");
		enseignement.setNom("Enseignement");
		enseignement.setDomaineLie(social);
		enseignement.setMetier(enseignant);
		enseignement = specialisationRepository.save(enseignement);

		langagePrimal.setDescription(
				"Communiquer de façon très basique, par des gestes, des attitudes et des expressions faciales avec des êtres primitifs ou dotés d'un langage complètement inconnu. Communiquer sommairement avec les animaux.");
		langagePrimal.setNom("Langage primal");
		langagePrimal.setDomaineLie(social);
		langagePrimal.setMetier(prospecteur);
		langagePrimal = specialisationRepository.save(langagePrimal);

		languesExotiques.setDescription(
				"Se baser sur diverses langues existantes pour aborder un dialecte inconnu et le maîtriser par la pratique. Un anthéen parle l'héossien (langue commune) et le langdiv (langue humaine), ainsi que sa langue raciale, mais cette Spécialisation devient fort utile pour comprendre et parler les autres langages raciaux et dialectes dérivés.");
		languesExotiques.setNom("Langues exotiques");
		languesExotiques.setDomaineLie(social);
		languesExotiques.setMetier(traducteur);
		languesExotiques = specialisationRepository.save(languesExotiques);

		psychologie.setDescription(
				"Soigner l'Esprit d'une personne qui a subi des blessures mentales en la rassurant, et en lui redonnant confiance en elle. Déterminer les pensées d'autrui par ses attitudes et son comportement. Anticiper les intentions. Comprendre la folie. Contrairement au Bluff, la Psychologie a des effets durables.");
		psychologie.setNom("Psychologie");
		psychologie.setDomaineLie(social);
		psychologie.setMetier(tenancier);
		psychologie = specialisationRepository.save(psychologie);

		seduction.setDescription(
				"S'attirer les faveurs et l'admiration du sexe opposé. La séduction peut se tenter sur un individu du même sexe, mais la réaction de l'individu en question dépendra largement des dispositions de la cible.");
		seduction.setNom("Seduction");
		seduction.setDomaineLie(social);
		seduction.setMetier(courtisan);
		seduction = specialisationRepository.save(seduction);

		vieUrbaine.setDescription(
				"Connaître les villes et les différentes structures sociales. Se repérer en agglomération. Semer quelqu'un. Se procurer des renseignements anodins ou secrets. Être à l'aise dans tout milieu urbain.");
		vieUrbaine.setNom("Vie Urbaine");
		vieUrbaine.setDomaineLie(social);
		vieUrbaine.setMetier(informateur);
		vieUrbaine = specialisationRepository.save(vieUrbaine);

		artsAppliques.setDescription(
				"Pratiquer le dessin, la peinture, la sculpture sur bois ou sur pierre. Connaître l'histoire de l'art.");
		artsAppliques.setNom("Arts appliqués");
		artsAppliques.setDomaineLie(arts);
		artsAppliques.setMetier(evocateur);
		artsAppliques = specialisationRepository.save(artsAppliques);

		artsDuFeu.setDescription(
				"Cracher du feu. Créer des feux d'artifices, et toutes sortes d'effets pyrotechniques ou de jeux de lumières.");
		artsDuFeu.setNom("Arts du feu");
		artsDuFeu.setDomaineLie(arts);
		artsDuFeu.setMetier(bateleur);
		artsDuFeu = specialisationRepository.save(artsDuFeu);

		chant.setDescription(
				"Chanter juste. Savoir poser sa voix. Lire une partition, accompagner en mesure un musicien. Savoir improviser. Connaître un vaste répertoire allant des chansons grivoises aux sérénades, en passant par les chants traditionnels. Séduire quelqu'un.");
		chant.setNom("Chant");
		chant.setDomaineLie(arts);
		chant.setMetier(chanteur);
		chant = specialisationRepository.save(chant);

		comedie.setDescription(
				"Faire du théâtre. Interpréter un rôle par cœur. Simuler les émotions. Imiter les voix. Créer des pièces et connaître sur le bout des doigts les répliques de tous les personnages des grands classiques héossiens. Se faire passer pour quelqu'un d'autre ou avoir l'air crédible en racontant des sornettes.");
		comedie.setNom("Comédie");
		comedie.setDomaineLie(arts);
		comedie.setMetier(comedien);
		comedie = specialisationRepository.save(comedie);

		deguisement.setDescription(
				"Modifier son apparence de manière tangible, avec trois fois rien. Fabriquer des masques, des costumes et autres parures afin d'être en mesure de métamorphoser un Mélodien en Ygwan et inversement (ce qui est déjà beaucoup plus difficile).");
		deguisement.setNom("Déguisement");
		deguisement.setDomaineLie(arts);
		deguisement.setMetier(costumier);
		deguisement = specialisationRepository.save(deguisement);

		gastronomie.setDescription(
				"Préparer des repas très élaborés, suivre des recettes et savoir en inventer. Reconnaître les bons produits et les préparer pour ensuite les cuisiner. Repérer si un plat est empoisonné. Un très bon repas a des vertus régénérantes.");
		gastronomie.setNom("Gastronomie");
		gastronomie.setDomaineLie(arts);
		gastronomie.setMetier(cuisinier);
		gastronomie = specialisationRepository.save(gastronomie);

		lettres.setDescription(
				"Transmettre les émotions par des mots. Écrire des poèmes, faire de la philosophie, mais également posséder une culture littéraire importante. Savoir lire et écrire une langue héossienne que l’on parle. Séduire quelqu'un.");
		lettres.setNom("Lettres");
		lettres.setDomaineLie(arts);
		lettres.setMetier(ecrivain);
		lettres = specialisationRepository.save(lettres);

		musique.setDescription(
				"Jouer des divers instruments existants. Lire une partition musicale. Composer des mélodies ou des symphonies. Connaître l'histoire de la musique. Séduire quelqu'un. Dresser un animal.");
		musique.setNom("Musique");
		musique.setDomaineLie(arts);
		musique.setMetier(musicien);
		musique = specialisationRepository.save(musique);

		trucages.setDescription(
				"Effectuer des tours de passe-passe. Faire de la prestidigitation. Jongler avec tous types d'objets. Dissimuler des objets aux yeux les plus avertis.");
		trucages.setNom("Trucages");
		trucages.setDomaineLie(arts);
		trucages.setMetier(prestidigitateur);
		trucages = specialisationRepository.save(trucages);

		langageDuCorps.setDescription(
				"Danser en mesure, pouvoir évoluer avec un ou une partenaire. Être capable de suivre une chorégraphie imposée ou d'en inventer une. Connaître les danses traditionnelles et celles en vogue. Pratiquer les massages du corps. Séduire quelqu'un. Un très bon massage a des vertus régénérantes.");
		langageDuCorps.setNom("Langage du corps");
		langageDuCorps.setDomaineLie(arts);
		langageDuCorps.setMetier(danseur);
		langageDuCorps = specialisationRepository.save(langageDuCorps);

		embiose.setDescription(
				"Résister à la confrontation avec un Trihn lors d'un rituel d'Embiose. Maximiser le gain d'expérience lié au rituel. Connaissance des lieux qui cachent une stèle d'Embiose.");
		embiose.setNom("Embiose");
		embiose.setDomaineLie(shaan);
		embiose.setMetier(chasseurDeSteles);
		embiose = specialisationRepository.save(embiose);

		empathieAnimale.setDescription(
				"Être en synergie avec le règne animal. Développer un lien empathique avec les animaux pour connaître leurs besoins vitaux, ainsi que la façon de les traiter. Établir une symbiose avec les armimales pacifistes ou utilitaires (mais pas les armimales d'attaque) et utiliser leurs capacités. Avoir accès intuitivement à des connaissances assez pointues sur les animaux.");
		empathieAnimale.setNom("Empathie animale");
		empathieAnimale.setDomaineLie(shaan);
		empathieAnimale.setMetier(eleveur);
		empathieAnimale = specialisationRepository.save(empathieAnimale);

		empathieAntheenne.setDescription(
				"Être en synergie avec les 10 races du Cercle des Réalités. Développer un lien empathique avec l'Âme des anthéens pour les calmer quand ils sont pris de folie, ou éviter de se faire bluffer. Avoir accès intuitivement à des connaissances assez pointues sur les comportements anthéens");
		empathieAntheenne.setNom("Empathie antheenne");
		empathieAntheenne.setDomaineLie(shaan);
		empathieAntheenne.setMetier(mentaliste);
		empathieAntheenne = specialisationRepository.save(empathieAntheenne);

		empathieMinerale.setDescription(
				"Être en synergie avec le règne minéral. Développer un lien empathique avec les minéraux pour reconstituer des évènements très anciens à partir de l’empreinte magnétique qu’ils laisseraient dans le décor. Avoir accès intuitivement à des connaissances assez pointues sur les minéraux.");
		empathieMinerale.setNom("Empathie minérale");
		empathieMinerale.setDomaineLie(shaan);
		empathieMinerale.setMetier(telluriste);
		empathieMinerale = specialisationRepository.save(empathieMinerale);

		empathieVegetale.setDescription(
				"Être en synergie avec le règne végétal. Développer un lien empathique avec les végétaux afin de savoir faire pousser n'importe quoi sur n'importe quel terrain (fleurs, arbres, fruits et légumes, algues, champignons). Avoir accès intuitivement à des connaissances assez pointues sur les plantes.");
		empathieVegetale.setNom("Empathie végétale");
		empathieVegetale.setDomaineLie(shaan);
		empathieVegetale.setMetier(cultivateur);
		empathieVegetale = specialisationRepository.save(empathieVegetale);

		intuition.setDescription(
				"Rester en éveil, ne pas se laisser surprendre, déceler un détail inhabituel dans une pièce. Percevoir passivement les événements. Être sensible aux particularités de son environnement. Voir l'Invisible, les manœuvres de Discrétion, les Trucages et les Larcins.");
		intuition.setNom("Intuition");
		intuition.setDomaineLie(shaan);
		intuition.setMetier(prescient);
		intuition = specialisationRepository.save(intuition);

		reve.setDescription(
				"Naviguer dans le monde des rêves. Résister aux cauchemars. Communiquer avec des personnes endormies via leurs rêves, sans contrainte de distance.");
		reve.setNom("Rêve");
		reve.setDomaineLie(shaan);
		reve.setMetier(marcheurDeReves);
		reve = specialisationRepository.save(reve);

		soinsDeLAme.setDescription(
				"Soigner l'Âme d'une personne qui a subi des blessures nécrotiques par la pratique de méthodes de magnétisme et de transfert d'énergie.");
		soinsDeLAme.setNom("Soins de l'âme");
		soinsDeLAme.setDomaineLie(shaan);
		soinsDeLAme.setMetier(ameVive);
		soinsDeLAme = specialisationRepository.save(soinsDeLAme);

		soinsDeLEsprit.setDescription(
				"Soigner l'Esprit d'une personne qui a subi des blessures mentales par la pratique de la rhétorique");
		soinsDeLEsprit.setNom("Soins de l'esprit");
		soinsDeLEsprit.setDomaineLie(shaan);
		soinsDeLEsprit.setMetier(gardeFou);
		soinsDeLEsprit = specialisationRepository.save(soinsDeLEsprit);

		soinsDuCorps.setDescription(
				"Soigner le Corps d'une personne qui a subi des blessures physiques par la pratique de massages, d'acuponcture...");
		soinsDuCorps.setNom("Soins du corps");
		soinsDuCorps.setDomaineLie(shaan);
		soinsDuCorps.setMetier(radiant);
		soinsDuCorps = specialisationRepository.save(soinsDuCorps);

		arcanes.setDescription(
				"Connaître la théorie qui régit la Magie des schèmes. Reconnaître les traces laissées par un Sort de Magie. Identifier les pouvoirs enchantés dans un artéfact. Connaître les différentes loges et écoles, leurs responsables, leurs organisations et leurs implications.");
		arcanes.setNom("Arcanes");
		arcanes.setDomaineLie(magie);
		arcanes.setMetier(arcanien);
		arcanes = specialisationRepository.save(arcanes);

		conjuration.setDescription(
				"Renvoyer un Trihn ou une Anti-Âme dans son plan d'origine. Priver ses adversaires magiciens de leurs ressources trihniques et les empêcher de lancer des Sorts ou des Tourments.");
		conjuration.setNom("Conjuration");
		conjuration.setDomaineLie(magie);
		conjuration.setMetier(conjurateur);
		conjuration = specialisationRepository.save(conjuration);

		defenseMagique.setDescription(
				"Manipuler les flux trihniques pour former un bouclier magique qui protège des attaques nécrotiques, des Sorts et des Tourments.");
		defenseMagique.setNom("Defense magique");
		defenseMagique.setDomaineLie(magie);
		defenseMagique.setMetier(revocateur);
		defenseMagique = specialisationRepository.save(defenseMagique);

		enchantement.setDescription(
				"Utiliser l’énergie d’un Trihn pour sceller un Pouvoir connu dans un objet afin de lui conférer des propriétés magiques. Le possesseur de l’objet enchanté peut se servir du Pouvoir investi pour un nombre limité d’utilisations.");
		enchantement.setNom("Enchantement");
		enchantement.setDomaineLie(magie);
		enchantement.setMetier(enchanteur);
		enchantement = specialisationRepository.save(enchantement);

		incandescence.setDescription(
				"Allumer un feu sans combustible. Irradier de la chaleur. Émettre une lumière éclairante. Résister aux dégâts liés au froid.");
		incandescence.setNom("Incandescence");
		incandescence.setDomaineLie(magie);
		incandescence.setMetier(mageItinerant);
		incandescence = specialisationRepository.save(incandescence);

		invocation.setDescription(
				"Invoquer un Trihn de Corps, d'Âme ou d'Esprit depuis son univers primordial. Un individu peut avoir un Trihn en transit autour de lui, mais peut en invoquer d'autres pour les transférer dans ses focaliseurs.");
		invocation.setNom("Invocation");
		invocation.setDomaineLie(magie);
		invocation.setMetier(shaman);
		invocation = specialisationRepository.save(invocation);

		maitriseDesSchemes.setDescription(
				"Appréhender la langue magique afin de savoir lire et écrire les schèmes nomoïs. Intégrer ces mots magiques dans des runes sculptées, gravées, tatouées, peintes,... qui décuplent les facultés des Magiciens. Créer de nouveaux Sorts.");
		maitriseDesSchemes.setNom("Maîtrise des schèmes");
		maitriseDesSchemes.setDomaineLie(magie);
		maitriseDesSchemes.setMetier(sorcier);
		maitriseDesSchemes = specialisationRepository.save(maitriseDesSchemes);

		regeneration.setDescription(
				"Régénérer l'essence de ses propres Trihns. Cette Spécialisation n'est applicable que pour soi-même et permet de soigner l'un de ses 3 Trihns au choix.");
		regeneration.setNom("Régénération");
		regeneration.setDomaineLie(magie);
		regeneration.setMetier(regenerateur);
		regeneration = specialisationRepository.save(regeneration);

		transfert.setDescription(
				"Charger un Focaliseur avec un Trihn en transit autour de soi. Transférer un Trihn que l’on a invoqué vers un autre Magicien allié, ou le récupérer un Trihn invoqué par un autre Magicien. Déplacer un Trihn d’un Focaliseur vers un autre Focaliseur.");
		transfert.setNom("Transfert");
		transfert.setDomaineLie(magie);
		transfert.setMetier(voleurDeTrihn);
		transfert = specialisationRepository.save(transfert);

		voile.setDescription(
				"Camoufler l’acte magique pour le rendre insoupçonnable. Atténuer les perturbations provoquées par la pratique de la magie en réduisant au minimum les gestes et les paroles magiques indispensables. Être discret dans l'utilisation des Spécialisations et Pouvoirs magiques, mais également percevoir l'invisible.");
		voile.setNom("Voile");
		voile.setDomaineLie(magie);
		voile.setMetier(illusionniste);
		voile = specialisationRepository.save(voile);

		riteDArts.setDescription(
				"S'investir de l'élément \"Autre\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à l'Autre d'une Heure environ, pour augmenter de 1 le niveau d'ARTS des participants pendant une Situation.");
		riteDArts.setNom("Rite d'arts");
		riteDArts.setDomaineLie(rituels);
		riteDArts.setMetier(discipleDeLautre);
		riteDArts = specialisationRepository.save(riteDArts);

		riteDeCombat.setDescription(
				"S'investir de l'élément \"Feu\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré au Feu d'une Heure environ, pour augmenter de 1 le niveau de COMBAT des participants pendant une Situation.");
		riteDeCombat.setNom("Rite de combat");
		riteDeCombat.setDomaineLie(rituels);
		riteDeCombat.setMetier(discipleDuFeu);
		riteDeCombat = specialisationRepository.save(riteDeCombat);

		riteDeLAnimal.setDescription(
				"S'investir de l'élément \"Animal\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à l'Animal d'une Heure environ, pour accorder un Bonus de 1 aux participants pendant une Situation. Ce Bonus s'applique aux Spécialisations suivantes : Sens du cuir (TECHNIQUE), Zoologie (SAVOIR), Langage Primal (SOCIAL), Langage du corps (ARTS), Empathie Animale (SHAAN), Invocation (MAGIE), Monture (SURVIE), Armimales (COMBAT), Harcèlement (NÉCROSE)");
		riteDeLAnimal.setNom("Rite de l'animal");
		riteDeLAnimal.setDomaineLie(rituels);
		riteDeLAnimal.setMetier(discipleDeLAnimal);
		riteDeLAnimal = specialisationRepository.save(riteDeLAnimal);

		riteDeMagie.setDescription(
				"S'investir de l'élément \"Moi\" afin de bénéficier de pouvoirs surnaturels.Effectuer un Rite consacré au Moi d'une Heure environ, pour augmenter de 1 le niveau de MAGIE des participants pendant une Situation.");
		riteDeMagie.setNom("Rite de magie");
		riteDeMagie.setDomaineLie(rituels);
		riteDeMagie.setMetier(discipleDuMoi);
		riteDeMagie = specialisationRepository.save(riteDeMagie);

		riteDeNecrose.setDescription(
				"S'investir de l'élément \"Limbes\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré aux Limbes d'une Heure environ, pour augmenter de 1 le niveau de NÉCROSE des participants pendant une Situation.");
		riteDeNecrose.setNom("Rite de nécrose");
		riteDeNecrose.setDomaineLie(rituels);
		riteDeNecrose.setMetier(discipleDesLimbes);
		riteDeNecrose = specialisationRepository.save(riteDeNecrose);

		riteDeSavoir.setDescription(
				"S'investir de l'élément \"Végétal\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré au Végétal d'une Heure environ, pour augmenter de 1 le niveau de SAVOIR des participants pendant une Situation.");
		riteDeSavoir.setNom("Rite de savoir");
		riteDeSavoir.setDomaineLie(rituels);
		riteDeSavoir.setMetier(discipleDuVegetal);
		riteDeSavoir = specialisationRepository.save(riteDeSavoir);

		riteDeShaan.setDescription(
				"S'investir de l'élément \"Terre\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à la Terre d'une Heure environ, pour augmenter de 1 le niveau de SHAAN des participants pendant une Situation.");
		riteDeShaan.setNom("Rite de shaan");
		riteDeShaan.setDomaineLie(rituels);
		riteDeShaan.setMetier(discipleDaLaTerre);
		riteDeShaan = specialisationRepository.save(riteDeShaan);

		riteDeSocial.setDescription(
				"S'investir de l'élément \"Air\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à l'Air d'une Heure environ, pour augmenter de 1 le niveau de SOCIAL des participants pendant une Situation.");
		riteDeSocial.setNom("Rite de social");
		riteDeSocial.setDomaineLie(rituels);
		riteDeSocial.setMetier(discipleDeLAir);
		riteDeSocial = specialisationRepository.save(riteDeSocial);

		riteDeSurvie.setDescription(
				"S'investir de l'élément \"Eau\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à l'Eau d'une Heure environ, pour augmenter de 1 le niveau de SURVIE des participants pendant une Situation.");
		riteDeSurvie.setNom("Rite de survie");
		riteDeSurvie.setDomaineLie(rituels);
		riteDeSurvie.setMetier(discipleDeLEau);
		riteDeSurvie = specialisationRepository.save(riteDeSurvie);

		riteDeTechnique.setDescription(
				"S'investir de l'élément \"Objet\" afin de bénéficier de pouvoirs surnaturels. Effectuer un Rite consacré à l'Objet d'une Heure environ, pour augmenter de 1 le niveau de TECHNIQUE des participants pendant une Situation.");
		riteDeTechnique.setNom("Rite de technique");
		riteDeTechnique.setDomaineLie(rituels);
		riteDeTechnique.setMetier(discipleDeLObjet);
		riteDeTechnique = specialisationRepository.save(riteDeTechnique);

		acrobatie.setDescription(
				"Être dynamique, souple, et rapide. Avoir le sens de l'équilibre. Faire des prouesses acrobatiques, faire l’équilibriste, amortir une chute, se contorsionner… Esquiver une attaque physique.");
		acrobatie.setNom("Acrobatie");
		acrobatie.setDomaineLie(survie);
		acrobatie.setMetier(voltigeur);
		acrobatie = specialisationRepository.save(acrobatie);

		caravane.setDescription(
				"Manœuvrer un attelage, une charrette, un carrosse, un char. Gérer une caravane et la logistique de ravitaillement qu'elle nécessite. Connaître les dispositifs de sécurité à mettre en place lorsqu'une menace survient.");
		caravane.setNom("Caravane");
		caravane.setDomaineLie(survie);
		caravane.setMetier(caravanier);
		caravane = specialisationRepository.save(caravane);

		cultureHeossienne.setDescription(
				"Connaître les us et coutumes des peuples héossiens, ainsi que la géographie de l'Héossie. Cette Spécialisation est principalement ancrée dans le présent. Le passé des peuples héossiens sont plus du ressort de la Spécialisation Histoire d'Héos (SAVOIR).");
		cultureHeossienne.setNom("Culture héossienne");
		cultureHeossienne.setDomaineLie(survie);
		cultureHeossienne.setMetier(guide);
		cultureHeossienne = specialisationRepository.save(cultureHeossienne);

		cultureNecrosienne.setDescription(
				"Connaître les différents stades de la nécrose, du maudit à l'incarnation, ainsi que des différentes voies qui mènent aux Limbes. Situer les divers empires nécrosiens, leurs modes de non-vie, leurs lois et leurs rituels. Rechercher l'emplacement de stèles d'Embiose.");
		cultureNecrosienne.setNom("Culture nécrosienne");
		cultureNecrosienne.setDomaineLie(survie);
		cultureNecrosienne.setMetier(traqueurDeStele);
		cultureNecrosienne = specialisationRepository.save(cultureNecrosienne);

		discretion.setDescription(
				"Se déplacer en silence, se cacher dans les ombres, se camoufler dans la nature. Tendre une embuscade. Semer quelqu'un autrement que par la course.");
		discretion.setNom("Discrétion");
		discretion.setDomaineLie(survie);
		discretion.setMetier(espion);
		discretion = specialisationRepository.save(discretion);

		educationPhysique.setDescription(
				"Courir, sauter, escalader, ramper, rouler, nager,... Avoir une bonne coordination motrice. Être endurant.");
		educationPhysique.setNom("Education physique");
		educationPhysique.setDomaineLie(survie);
		educationPhysique.setMetier(athlete);
		educationPhysique = specialisationRepository.save(educationPhysique);

		monture.setDescription(
				"Chevaucher tout type de monture. Diriger des créatures volantes, terrestres ou marines.");
		monture.setNom("Monture");
		monture.setDomaineLie(survie);
		monture.setMetier(messager);
		monture = specialisationRepository.save(monture);

		monture.setDescription(
				"Chevaucher tout type de monture. Diriger des créatures volantes, terrestres ou marines.");
		monture.setNom("Monture");
		monture.setDomaineLie(survie);
		monture.setMetier(messager);
		monture = specialisationRepository.save(monture);

		navigation.setDescription(
				"Naviguer en milieu aquatique ou en milieu aérien. Reconnaître les courants et les interpréter, maîtriser les principes aérodynamiques et hydrauliques permettant de voyager dans les airs et dans l’eau. S'orienter en mer ou dans les airs. Piloter tous types d'engins volants ou marins qui ne comportent pas de technologie humaine. Prédire la météo.");
		navigation.setNom("Navigation");
		navigation.setDomaineLie(survie);
		navigation.setMetier(navigateur);
		navigation = specialisationRepository.save(navigation);

		vieSauvage.setDescription(
				"Connaître tout ce qui a trait au milieu terrestre et à son adaptation. Pister, chasser, poser des pièges, allumer un feu par grand vent, établir un campement réconfortant, se laver à l'eau froide,…");
		vieSauvage.setNom("Vie sauvage");
		vieSauvage.setDomaineLie(survie);
		vieSauvage.setMetier(chasseur);
		vieSauvage = specialisationRepository.save(vieSauvage);

		vieSauvage.setDescription(
				"Connaître tout ce qui a trait au milieu terrestre et à son adaptation. Pister, chasser, poser des pièges, allumer un feu par grand vent, établir un campement réconfortant, se laver à l'eau froide,…");
		vieSauvage.setNom("Vie sauvage");
		vieSauvage.setDomaineLie(survie);
		vieSauvage.setMetier(chasseur);
		vieSauvage = specialisationRepository.save(vieSauvage);

		vigilance.setDescription(
				"Mettre ses sens en éveil, percevoir activement son environnement, contrairement à l'Intuition du Shaan qui traduit la perception passive. Scruter l’horizon pour y découvrir une silhouette inhabituelle. Guetter une proie. Identifier un élément lointain. Avoir le sens de l’orientation.");
		vigilance.setNom("Vigilance");
		vigilance.setDomaineLie(survie);
		vigilance.setMetier(eclaireur);
		vigilance = specialisationRepository.save(vigilance);

		armesAProjectiles.setDescription(
				"Savoir manipuler toutes les armes à déclencheur mécanique comme les arbalètes, mais également les armes sans déclencheur tels que arc, fronde, sarbacane, arbalète, lance-pointe, lance-feu, servant à propulser après tension d’une corde ou utilisation de la force giratoire, divers projectiles.");
		armesAProjectiles.setNom("Armes à projectiles");
		armesAProjectiles.setDomaineLie(combat);
		armesAProjectiles.setMetier(archer);
		armesAProjectiles = specialisationRepository.save(armesAProjectiles);

		armesDeMelee.setDescription(
				"Savoir utiliser toutes les armes de corps à corps, des armes courtes comme la dague, le glaive et autres couteaux, shaar, serpine, seltar, aux armes moyennes comme l’épée mélodienne, feling, les petites masses, le yink, mais aussi les armes longues et lourdes comme l’épée darken, la lame lune, la masse woon, les armes d’hast,...");
		armesDeMelee.setNom("Armes de mêlee");
		armesDeMelee.setDomaineLie(combat);
		armesDeMelee.setMetier(gladiateur);
		armesDeMelee = specialisationRepository.save(armesDeMelee);

		armesLancees.setDescription(
				"Savoir utiliser les armes à propulsion directe, sans intervention de force autre que celle du bras, tels que filets, couteaux de lancer, nashen, lance mélodienne, boomerangs, bolas,…");
		armesLancees.setNom("Armes lancées");
		armesLancees.setDomaineLie(combat);
		armesLancees.setMetier(francTireur);
		armesLancees = specialisationRepository.save(armesLancees);

		armimales.setDescription(
				"Dresser les armimales d’attaque et de défense afin qu’elles offrent l’efficacité maximale en combat. Savoir comment s’en occuper et connaître leurs besoins.");
		armimales.setNom("Armimales");
		armimales.setDomaineLie(combat);
		armimales.setMetier(armimalier);
		armimales = specialisationRepository.save(armimales);

		enginsDeGuerre.setDescription(
				"Savoir utiliser des engins de guerre comme les armes de siège, les catapultes, balistes et autres trébuchets. Les Engins de Guerre regroupent toutes les armes qui sont conçues pour détruire les bâtiments et les véhicules.");
		enginsDeGuerre.setNom("Engins de guerre");
		enginsDeGuerre.setDomaineLie(combat);
		enginsDeGuerre.setMetier(artilleur);
		enginsDeGuerre = specialisationRepository.save(enginsDeGuerre);

		esquive.setDescription(
				"Manœuvrer avec une posture défensive dans un combat pour se retrouver en position avantageuse pour fuir ou contre-attaquer le tour suivant.");
		esquive.setNom("Esquive");
		esquive.setDomaineLie(combat);
		esquive.setMetier(fantassin);
		esquive = specialisationRepository.save(esquive);

		forcer.setDescription(
				"Manœuvrer avec une posture défensive dans un combat pour se retrouver en position avantageuse pour fuir ou contre-attaquer le tour suivant.");
		forcer.setNom("Forcer");
		forcer.setDomaineLie(combat);
		forcer.setMetier(soldat);
		forcer = specialisationRepository.save(forcer);

		intimidation.setDescription(
				"Faire changer d'avis quelqu'un qui aurait de mauvaises intentions à votre égard, d'un regard ou en arborant une attitude combattive. Obtenir des renseignements lors d'interrogatoires et par d’autres pratiques peu morales. Impressionner son adversaire au combat. Donner des ordres indiscutables dans le feu de l’action.");
		intimidation.setNom("Intimidation");
		intimidation.setDomaineLie(combat);
		intimidation.setMetier(protecteur);
		intimidation = specialisationRepository.save(intimidation);

		pugilat.setDescription(
				"N'utiliser que son corps pour vaincre l'adversaire. Appliquer les diverses techniques de combat visant à frapper avec toutes les parties du corps mais également à neutraliser un adversaire à l'aide de blocages et de strangulations. C’est la Spécialisation utilisée pour les armes directement fixées sur le corps telles que lameur, coudines, gants de métal, griffes etc.");
		pugilat.setNom("Pugilat");
		pugilat.setDomaineLie(combat);
		pugilat.setMetier(gardeMine);
		pugilat = specialisationRepository.save(pugilat);

		strategie.setDescription(
				"Définir une tactique à grande échelle visant à vaincre des armées entières. Commander à des troupes militaires. Manœuvrer dans un combat au contact pour exploiter les avantages du terrain et gêner ses adversaires. Obtenir des informations sur l'état des Trihns d'un adversaire.");
		strategie.setNom("Strategie");
		strategie.setDomaineLie(combat);
		strategie.setMetier(gardienDesForets);
		strategie = specialisationRepository.save(strategie);

		armesHumaines.setDescription(
				"Utiliser toutes les armes technologiques humaines, depuis les armes de poing et les armes d’épaules (pistolet, étourdisseur, gazeur, arbalète de poing à fusion, fusils d'assaut, encapsuleurs, arcs magnétiques,…), jusqu'aux armes lourdes, type dépeupleurs, brûleurs, lance-roquettes, bazookas, ainsi que les armes à pied ou embarquées à bord de véhicules (tourelles, torpilles, canon à plasma,...). Savoir tirer le meilleur parti des combinaisons de combat, de la plus légère à l’exosquelette des légions d’Antarès.");
		armesHumaines.setNom("Armes humaines");
		armesHumaines.setDomaineLie(necrose);
		armesHumaines.setMetier(mitrailleur);
		armesHumaines = specialisationRepository.save(armesHumaines);

		biomorphie.setDescription(
				"Étudier les principes vivants et les écosystèmes auxquels ils sont associés d'un point de vue scientifique. Maîtriser les techniques chirurgicales assistées par ordinateur ou traditionnelles, les greffes mais également la génétique et les moyens de manipuler l'ADN. Élever des morphes afin de les fondre à un module de tâche spécifique. Soigner ou changer un morphe défectueux ou améliorer ses performances");
		biomorphie.setNom("Biomorphie");
		biomorphie.setDomaineLie(necrose);
		biomorphie.setMetier(geneticien);
		biomorphie = specialisationRepository.save(biomorphie);

		cauchemar.setDescription(
				"S'immiscer dans les rêves des êtres pour les transformer en cauchemars, empêchant ainsi toute régénération de Trihn pendant quelques jours. Le Cauchemar de la NÉCROSE est opposé au Rêve du SHAAN.");
		cauchemar.setNom("Cauchemar");
		cauchemar.setDomaineLie(necrose);
		cauchemar.setMetier(ensorceleur);
		cauchemar = specialisationRepository.save(cauchemar);

		contrebande.setDescription(
				"Acheter, vendre et acheminer des marchandises illégales. Importer des armes interdites, faire transiter un chargement d’explosifs, transporter des esclaves clandestins, négocier le prix de renseignements ou gérer un réseau de marché noir.");
		contrebande.setNom("Contrebande");
		contrebande.setDomaineLie(necrose);
		contrebande.setMetier(trafiquant);
		contrebande = specialisationRepository.save(contrebande);

		corruption.setDescription(
				"Acheter le silence de quelqu'un afin de contourner la légalité. Exploiter les vices d’une personne pour en tirer un avantage personnel.");
		corruption.setNom("Corruption");
		corruption.setDomaineLie(necrose);
		corruption.setMetier(escroc);
		corruption = specialisationRepository.save(corruption);

		explosifs.setDescription(
				"Connaître les diverses techniques de sabotage pour détruire un édifice ou un véhicule. Mettre hors d'état de nuire un nombre important de personnes. Manipuler tous les types d'explosifs de la grenade au TNT en passant par la dynamite et les capsules à fusion.");
		explosifs.setNom("Explosifs");
		explosifs.setDomaineLie(necrose);
		explosifs.setMetier(artificier);
		explosifs = specialisationRepository.save(explosifs);

		fraude.setDescription(
				"Savoir faire de la contrefaçon ou des faux papiers. Connaître les failles d'un système politique, financier, juridique ou administratif afin de les détourner à son avantage.");
		fraude.setNom("Fraude");
		fraude.setDomaineLie(necrose);
		fraude.setMetier(faussaire);
		fraude = specialisationRepository.save(fraude);

		harcelement.setDescription(
				"Savoir utiliser toutes les techniques permettant de déstabiliser et de nécroser une cible en la giflant, lui crachant dessus, la bousculant et en lui faisant perdre tous ses moyens. Le Harcèlement répété peut nécroser rapidement une victime si l'on n'y prend pas garde...");
		harcelement.setNom("Harcèlement");
		harcelement.setDomaineLie(necrose);
		harcelement.setMetier(voyou);
		harcelement = specialisationRepository.save(harcelement);

		larcin.setDescription(
				"Faire les poches. Connaître également les jeux de hasard ou de stratégie et les milieux où on les pratique. Tricher, accessoirement. Repérer, reconnaître et neutraliser les systèmes de surveillance et de protection de bâtiments ou de véhicules.");
		larcin.setNom("Larcin");
		larcin.setDomaineLie(necrose);
		larcin.setMetier(voleur);
		larcin = specialisationRepository.save(larcin);

		pacteNecrotique.setDescription(
				"Invoquer une Anti-Âme, essence négative issue des Limbes, et l'utiliser pour pratiquer la Magie des Limbes. Pactiser avec une incarnation");
		pacteNecrotique.setNom("Pacte necrotique");
		pacteNecrotique.setDomaineLie(necrose);
		pacteNecrotique.setMetier(necromant);
		pacteNecrotique = specialisationRepository.save(pacteNecrotique);
		

// -------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET PEUPLE
//-------------------------------------------------------------------------------------------------------------------------

		foretsBlanches.setNomPeuple("Forêts Blanches");
		foretsBlanches.setDomaine(rituels);
		foretsBlanches.setSpecialisation1(langageDuCorps);
		foretsBlanches.setSpecialisation2(educationPhysique);
		foretsBlanches.setDescription(
				"De vastes forêts de conifères se recouvrent de neige l'hiver venu. La taïga, ou forêt boréale, étonne par sa densité et sa persistance à des altitudes défiant l'imagination. Les arbres sont moins grands que dans les régions chaudes mais les variétés de plantes sont tout aussi foisonnantes. De nombreux Temples rythment les haltes des Voyageurs.");
		foretsBlanches = peupleRepository.save(foretsBlanches);

		glaces.setNomPeuple("Glaces");
		glaces.setDomaine(magie);
		glaces.setSpecialisation1(arcanes);
		glaces.setSpecialisation2(langagePrimal);
		glaces.setDescription(
				"Les côtes sont bordées par une zone de glace aux contours instables. De nombreux plateaux recouverts de glaciers s'élèvent à plus de deux mille mètres. La vie au milieu des terres est impossible. Seul le littoral offre une réserve de gibier susceptible de nourrir les populations locales.");
		glaces = peupleRepository.save(glaces);

		grandsArbres.setNomPeuple("Grands Arbres");
		grandsArbres.setDomaine(shaan);
		grandsArbres.setSpecialisation1(empathieVegetale);
		grandsArbres.setSpecialisation2(empathieAnimale);
		grandsArbres.setDescription(
				"Cette épaisse forêt de gigantesques arbres verts peut atteindre une centaine de mètres de hauteur et son feuillage est persistant.");
		grandsArbres = peupleRepository.save(grandsArbres);

		hautesHerbes.setNomPeuple("Hautes Herbes");
		hautesHerbes.setDomaine(arts);
		hautesHerbes.setSpecialisation1(musique);
		hautesHerbes.setSpecialisation2(commerce);
		hautesHerbes.setDescription(
				"De vastes plaines d'herbe grasse s'étendent à l'infini. Parsemées d'arbres et de petits bosquets, ces régions sont principalement exploitées pour l'agriculture et l'élevage.");
		hautesHerbes = peupleRepository.save(hautesHerbes);

		marais.setNomPeuple("Marais");
		marais.setDomaine(savoir);
		marais.setSpecialisation1(zoologie);
		marais.setSpecialisation2(botanique);
		marais.setDescription(
				"De hauts arbres plongent leurs puissantes racines dans les vastes étendues d'eau peu profondes des marais verts, jaunes et rouges. On ne trouve quasiment que des Ygwans dans les Marais, car eux seuls semblent apprécier la constante humidité et la chaleur de l'endroit.");
		marais = peupleRepository.save(marais);

		montagnes.setNomPeuple("Montagnes");
		montagnes.setDomaine(social);
		montagnes.setSpecialisation1(educationPhysique);
		montagnes.setSpecialisation2(languesExotiques);
		montagnes.setDescription(
				"De roches et de pics, cette région froide a été prise d'assaut par les Delhions. Des conifères parsèment le pied des Montagnes, pour rapidement laisser place à la roche puis à la neige. Les conditions de vie y sont rigoureuses, car l'oxygène se raréfie en haute altitude. La montagne est un environnement très dangereux pour celui qui ne la connait pas. L'.entre-aide reste donc une priorité pour ceux qui doivent survivre dans ce milieu. Habitués à cotoyer des natifs de tous horizons, les montagnards ont développé une facilité à communiquer dans d'autres langages que les leurs.");
		montagnes = peupleRepository.save(montagnes);

		rivages.setNomPeuple("Rivages");
		rivages.setDomaine(survie);
		rivages.setSpecialisation1(navigation);
		rivages.setSpecialisation2(educationPhysique);
		rivages.setDescription(
				"Le milieu varie selon le climat de la région, allant de la plage de sable fin bordée d'arbres enchanteurs dans les régions chaudes aux gigantesques falaises abruptes des contrées plus froides. Sur Héos, les marées ont une amplitude colossale. Cela oblige les Peuples de la mer à consolider constamment les digues et barrages nécessaires à leur survie. Les Ygwans et les Kelwi ns de ces milieux maîtrisent la construction de ces édifices protecteurs et un maçon a droit au même respect qu'un grand navigateur. Le littoral et les fonds marins offrent une profusion de plantes et d' animaux divers. Les cités lacustres peuvent s'étendre sur des kilomètres le long des côtes et se prolongent dans la mer grâce aux ports.");
		rivages = peupleRepository.save(rivages);

		sables.setNomPeuple("Sables");
		sables.setDomaine(combat);
		sables.setSpecialisation1(monture);
		sables.setSpecialisation2(histoireDHeos);
		sables.setDescription(
				"Les Sables sont de vastes étendues arides de sable tassé ou en formation dunaire et de rochers plus ou moins saillants. Perpétuellement balayé par de terribles vents, le désert est une transition entre les Terres Brûlées et les Hautes Herbes chaudes. Selon la présence ou l'absence des pluies, il oscillera entre ces deux régions.");
		sables = peupleRepository.save(sables);

		terresBrulees.setNomPeuple("Terres Brûlées");
		terresBrulees.setDomaine(technique);
		terresBrulees.setSpecialisation1(navigation);
		terresBrulees.setSpecialisation2(recuperation);
		terresBrulees.setDescription(
				"De gigantesques canyons, des plateaux qui s'élèvent à l'infini, des gouffres et des ravins qui transforment la lumière en ténèbres, tel est le décor des Terres Brûlées. Les Peuples des Terres Brûlées sont obligés de compenser la dureté de leur environnement par de rastuce et des trouvailles techniques. Si personne ne veut habiter les Terres Brûlées, nombreux sont ceux qui rêvent d'en récupérer toutes les richesses ...");
		terresBrulees = peupleRepository.save(terresBrulees);

		cites.setNomPeuple("Cités");
		cites.setDomaine(necrose);
		cites.setSpecialisation1(cultureHumaine);
		cites.setSpecialisation2(vieUrbaine);
		cites.setDescription(
				"Cités tentaculaires de bâtiments aux formes improbables, dressant leurs tours de pierre et de verre en offrande au ciel, ou au contraire plongeant leurs souterrains (égouts et habitations troglodytes) dans les entrailles de la terre, les mégalopoles héossiennes regorgent de vie . . . et de mort. Car si la vie y est agréable et animée dans les beaux quartiers et dans les secteurs résidentiels, les bas-fonds restent de vrais coupe-gorges et constituent des enclaves où l'Ombre impose ses lois.");
		cites = peupleRepository.save(cites);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET RACE
//-------------------------------------------------------------------------------------------------------------------------	
		boreals.setNomRace("Boreals");
		boreals.setDomaine(survie);
		boreals.setSpecialisation1(vigilance);
		boreals.setSpecialisation2(navigation);
		boreals.setTailleEstimation("1,6m à 1,9 m");
		boreals.setPoidsEstimation("60 à 120 kg");
		boreals.setLangues("Héossien, Boréal");
		boreals.setPouvoirDeRace("Vision Boréal");
		boreals.setPeupleOrigine(rivages);
		boreals.setCastePredilection(voyageurs);
		boreals.setElementTotem("Eau");
		boreals.setCouleurSymbolique("Bleu marine");
		boreals = raceRepository.save(boreals);

		darkens.setNomRace("Darkens");
		darkens.setDomaine(combat);
		darkens.setSpecialisation1(armesDeMelee);
		darkens.setSpecialisation2(monture);
		darkens.setTailleEstimation("1,9m à 2,3 m");
		darkens.setPoidsEstimation("80 à 200 kg");
		darkens.setLangues("Héossien, Darken");
		darkens.setPouvoirDeRace("Rage Darken");
		darkens.setPeupleOrigine(sables);
		darkens.setCastePredilection(combattants);
		darkens.setElementTotem("Feu");
		darkens.setCouleurSymbolique("Rouge");
		darkens = raceRepository.save(darkens);

		delhions.setNomRace("Delhions");
		delhions.setDomaine(social);
		delhions.setSpecialisation1(musique);
		delhions.setSpecialisation2(enseignement);
		delhions.setTailleEstimation("1,7m à 1,9 m");
		delhions.setPoidsEstimation("70 à 100 kg");
		delhions.setLangues("Héossien, Delhion");
		delhions.setPouvoirDeRace("Vol Delhion");
		delhions.setPeupleOrigine(montagnes);
		delhions.setCastePredilection(negociants);
		delhions.setElementTotem("Air");
		delhions.setCouleurSymbolique("Bleu ciel");
		delhions = raceRepository.save(delhions);

		felings.setNomRace("Felings");
		felings.setDomaine(shaan);
		felings.setSpecialisation1(intuition);
		felings.setSpecialisation2(discretion);
		felings.setTailleEstimation("1,5m à 1,9 m");
		felings.setPoidsEstimation("50 à 100 kg");
		felings.setLangues("Héossien, Feling");
		felings.setPouvoirDeRace("Soutien Feling");
		felings.setPeupleOrigine(grandsArbres);
		felings.setCastePredilection(shaanistes);
		felings.setElementTotem("Terre");
		felings.setCouleurSymbolique("Blanc");
		felings = raceRepository.save(felings);

		kelwins.setNomRace("Kelwins");
		kelwins.setDomaine(technique);
		kelwins.setSpecialisation1(engrenages);
		kelwins.setSpecialisation2(recuperation);
		kelwins.setTailleEstimation("0,9 m à 1,3 m");
		kelwins.setPoidsEstimation("30 à 100 kg");
		kelwins.setLangues("Héossien, Kelwinian");
		kelwins.setPouvoirDeRace("Logique Kelwin");
		kelwins.setPeupleOrigine(terresBrulees);
		kelwins.setCastePredilection(novateurs);
		kelwins.setElementTotem("Objet");
		kelwins.setCouleurSymbolique("Orange");
		kelwins = raceRepository.save(kelwins);

		melodiens.setNomRace("Melodiens");
		melodiens.setDomaine(arts);
		melodiens.setSpecialisation1(chant);
		melodiens.setSpecialisation2(seduction);
		melodiens.setTailleEstimation("1,5 m à 1,9 m");
		melodiens.setPoidsEstimation("30 à 80 kg");
		melodiens.setLangues("Héossien, Mélodian");
		melodiens.setPouvoirDeRace("Aura Mélodienne");
		melodiens.setPeupleOrigine(hautesHerbes);
		melodiens.setCastePredilection(artistes);
		melodiens.setElementTotem("Autre");
		melodiens.setCouleurSymbolique("Violet");
		melodiens = raceRepository.save(melodiens);

		nomois.setNomRace("Nomoïs");
		nomois.setDomaine(magie);
		nomois.setSpecialisation1(geologie);
		nomois.setSpecialisation2(maitriseDesSchemes);
		nomois.setTailleEstimation("1,5 m à 1,9 m");
		nomois.setPoidsEstimation("40 à 80 kg");
		nomois.setLangues("Héossien, Nomoï");
		nomois.setPouvoirDeRace("Sagesse Nomoï");
		nomois.setPeupleOrigine(glaces);
		nomois.setCastePredilection(magiciens);
		nomois.setElementTotem("Moi");
		nomois.setCouleurSymbolique("Argent");
		nomois = raceRepository.save(nomois);

		woons.setNomRace("Woons");
		woons.setDomaine(rituels);
		woons.setSpecialisation1(educationPhysique);
		woons.setSpecialisation2(intimidation);
		woons.setTailleEstimation("2,2 m à 2,7 m");
		woons.setPoidsEstimation("100 à 300 kg");
		woons.setLangues("Héossien, Woon");
		woons.setPouvoirDeRace("Résistance Woon");
		woons.setPeupleOrigine(foretsBlanches);
		woons.setCastePredilection(elementalistes);
		woons.setElementTotem("Animal");
		woons.setCouleurSymbolique("Or");
		woons = raceRepository.save(woons);

		ygwans.setNomRace("Ygwans");
		ygwans.setDomaine(savoir);
		ygwans.setSpecialisation1(histoireDHeos);
		ygwans.setSpecialisation2(vieSauvage);
		ygwans.setTailleEstimation("1,5 m à 1,9 m");
		ygwans.setPoidsEstimation("60 à 150 kg");
		ygwans.setLangues("Héossien, Ygwan");
		ygwans.setPouvoirDeRace("Regénération Ygwan");
		ygwans.setPeupleOrigine(marais);
		ygwans.setCastePredilection(erudits);
		ygwans.setElementTotem("Végétal");
		ygwans.setCouleurSymbolique("Vert");
		ygwans = raceRepository.save(ygwans);

		humains.setNomRace("Humains");
		humains.setDomaine(necrose);
		humains.setSpecialisation1(cultureHumaine);
		humains.setSpecialisation2(technologie);
		humains.setTailleEstimation("1,6 m à 1,9 m");
		humains.setPoidsEstimation("60 à 120 kg");
		humains.setLangues("Héossien, Langdiv");
		humains.setPouvoirDeRace("Névrose Humain");
		humains.setPeupleOrigine(cites);
		humains.setCastePredilection(ombres);
		humains.setElementTotem("Limbes");
		humains.setCouleurSymbolique("Noir");
		humains = raceRepository.save(humains);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		

		forteresse.setNomMotivation("Bâtir une forteresse imprenable");
		forteresse.setDescription(
				"Vous êtes atteint d'un sentiment d'insécurité chronique. Vous passez votre temps à imaginer des systèmes de protection les plus improbables pourfortifier une ville et la rendre inattaquable. Vous vez besoin de protéger des vies pour vous sentir bien.");
		forteresse.setDomaineLie(technique);
		forteresse = motivationRepository.save(forteresse);

		palais.setNomMotivation("Bâtir un palais");
		palais.setDescription(
				"Vous aimez vous mettre au service d'un Notable afin de lui confectionner une demeure sur mesure. L'idée est de saisir la personnalité de celui que vous servez afin de traduireles principaux traits de caractères en éléments architecturaux.");
		palais.setDomaineLie(technique);
		palais = motivationRepository.save(palais);

		machineSousMarine.setNomMotivation("Construire une machine sous-marine");
		machineSousMarine.setDescription(
				"Vous préférez explorer les profondeurs abyssales des océans à bords de sumersibles extravagants mais la plupart du temps fiable. Défier les profondeur impose une grande rigueur technique mais cela ne vous arrêtera pas et vous ferez tout pour arriver à explorer ce monde encore inconnu de tous.");
		machineSousMarine.setDomaineLie(technique);
		machineSousMarine = motivationRepository.save(machineSousMarine);

		ouvrage.setNomMotivation("Ecrire un ouvrage");
		ouvrage.setDescription(
				"Pour vous, l'encyclopédie de la connaissance absolue est une quête de longue haleine, car il existe déjà quantité d'ouvrages pertinents sur tout un tas de sujets. Vous devrez donc trouver un axe créatif original qui vous permettrea de présenter votre savoir senlon des thématiques novatrices.");
		ouvrage.setDomaineLie(savoir);
		ouvrage = motivationRepository.save(ouvrage);

		universite.setNomMotivation("Fonder une Université");
		universite.setDescription(
				"Vous voulez fonder une Université et en être le dirigeant afin de vous élever au statut de Notable. Même si les premières années attirent rarement de bon élèves, le temps aide à obtenir de meilleur résultat et mettre en avant le fondateur.");
		universite.setDomaineLie(savoir);
		universite = motivationRepository.save(universite);

		transmettreSavoir.setNomMotivation("Transmettre son Savoir");
		transmettreSavoir.setDescription(
				"Vous vous situez dans une filiation et reproduisez le schéma qu'on vous a enseigné. Le Savoir est le bien le plus précieux et doit être partagé par tous pour rendre chacun meilleur et plus armé pour survivre dans un environnement en constante évolution.");
		transmettreSavoir.setDomaineLie(savoir);
		transmettreSavoir = motivationRepository.save(transmettreSavoir);

		riche.setNomMotivation("Devenir riche");
		riche.setDescription(
				"le Gain d'argent reste la Motivation partagée par la majoritée des individus. L'argent donne du pouvoir et le pouvoir procure un peu de liberté. Et la liberté est quelque chose dont tout le monde à besoin actuellement.");
		riche.setDomaineLie(social);
		riche = motivationRepository.save(riche);

		notable.setNomMotivation("Devenir un Notable");
		notable.setDescription(
				"Le sentiment de réussite personnelle peut passer par une certaine forme de reconnaissance. Devenir un/une Notable constitue pour n'importe quel marchand une Motivation très importante.");
		notable.setDomaineLie(social);
		notable = motivationRepository.save(notable);

		seduire.setNomMotivation("Seduire les autres");
		seduire.setDescription(
				"Vous connaissez le pouvoir que vous exercez sur autrui et vous aimez en abuser. Cela constitue pour vous une Motivation qui occupe chaque instant de votre vie. Dès que vous rencontrez une nouvelle personne, vous éprouvez le besoin d'user de votre charisme pour le mettre dans votre poche.");
		seduire.setDomaineLie(social);
		seduire = motivationRepository.save(seduire);

		charmer.setNomMotivation("Charmer les puissants");
		charmer.setDescription(
				"l'Art est universel car il traverse les frontières et s'affranchit des modes et des clivages. Connaissant votre influence sur les autres vous aimez jouer avec votre public, le sentir vaciller au contact de votre art. Et lorsqu'il sagit de puissants Notables, ivre de pouvoir, vous pouvez vous transcender pour vous attirer des faveurs.");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);

		celebre.setNomMotivation("Devenir célèbre");
		celebre.setDescription(
				"Vous chercher la célébrité à tout prix. Vous voulez être connu et reconnu par vos pairs, pour vos oeuvres autant que pour votre personnalité et votre style.");
		celebre.setDomaineLie(arts);
		celebre = motivationRepository.save(celebre);

		mode.setNomMotivation("Créer un courant de mode");
		mode.setDescription(
				"Les modes font et défont les Artistes donc autant créer ses propres courants. A la recherche des tendances en vogues en peinture, musique, littératures, spectacles et autres divertissements, vous cherchez l'opportunité qui vous permettra de placer au bon moment, le bon concept pour les bonnes personnes.");
		mode.setDomaineLie(arts);
		mode = motivationRepository.save(mode);

		genereux.setNomMotivation("Etre généreux");
		genereux.setDescription(
				"Vous vous positionnez comme un bon samaritain et partagerez toujours vos richesses avec plus pauvres que vous afin d'éradiquer la misère. Votre générositése traduit aussi par la façon que vous avez d'offrir des cadeaux à votre entourageet d'êtres pleins de bonnes intentions.");
		genereux.setDomaineLie(shaan);
		genereux = motivationRepository.save(genereux);

		trouverAmeSoeur.setNomMotivation("Trouver son Âme soeur");
		trouverAmeSoeur.setDescription(
				"Vous êtes en quête d'amour. Vous cherchez votre Âme soeur, pour faire le reste du chemin avec elle. Romantique et fleur bleue, vous savez déployer des trésors de séduction si la personne que vous avez repérée reste sourdeou aveugle à votre amour. Vous préservant pour une seule personne, vous attendez la bonne en vivant comme un ascète en évitant soigneusement les pièges de la tentation.");
		trouverAmeSoeur.setDomaineLie(shaan);
		trouverAmeSoeur = motivationRepository.save(trouverAmeSoeur);

		aider.setNomMotivation("Aider les autres");
		aider.setDescription(
				"Pour vous l'Autre est une partie du Moi. En aidant l'Autre, vous vous aidez vous-même. Le coeur sur la main, vous offrez vos service à tous ceux que vous croiser et qui en ont besoin. Avec le temps, vous avez su repérer ceux qui veulent profiter de vous et ceux qui ont véritablement besoin de vous.");
		aider.setDomaineLie(shaan);
		aider = motivationRepository.save(aider);

		combattreFailles.setNomMotivation("Combattres ses failles");
		combattreFailles.setDescription(
				"L'ennemi le plus redoutable reste soi-même. Vous appropriant cet adage, vous faites tout pour travailler sur vous-même afin de devenir meilleur. Vous avez besoin que les Autres vous fassent des compliments sur vos progrès afin de vous épanouir et vous rendre meilleur.");
		combattreFailles.setDomaineLie(magie);
		combattreFailles = motivationRepository.save(combattreFailles);

		enseignerMagie.setNomMotivation("Enseigner la Magie");
		enseignerMagie.setDescription(
				"Vous vous inscrivez dans la transmision et vous connaissez l'importance que revêt le partage du savoir. Vous savez que vous ne seriez rien sans les autres Magiciens qui vous ont permis de devenir ce que vous êtes aujourd'hui.");
		enseignerMagie.setDomaineLie(magie);
		enseignerMagie = motivationRepository.save(enseignerMagie);

		percerMysteres.setNomMotivation("Percer les mystères des arcane");
		percerMysteres.setDescription(
				"La Magie ets lié au cerecles des Trihns, mais si la théorie est perceptible de tous, la pratique relève de nombreuses zones d'ombres, des phénomènes inexpliqués, des situations paradoxales. Vous voulez rester maîtres de votre art et voulez tout comprendre pour pouvoir bien contrôler ce que vous faites au moment où vous le faites.");
		percerMysteres.setDomaineLie(magie);
		percerMysteres = motivationRepository.save(percerMysteres);
		
		progresserDogme.setNomMotivation("Progresser au sein de son dogme");
		progresserDogme.setDescription("Vous expérimentez les voies internes de votre dogme et aspirez à progresser dans la symbiose avec votre Élément. Vous êtes enclin à faire de multiples expériences, braver de nombreux dangers afin de tester votre foi. Au moindre signe de faiblesse, vous redoublez d’efforts pour chercher à vous transcender. Vous avez parfois tendance à provoquer des situations qui pourraient vous mettre en mauvaise posture, rien que pour voir si vous êtes dignes de votre Élément..");
		progresserDogme.setDomaineLie(rituels);
		progresserDogme = motivationRepository.save(progresserDogme);
		
		confronterElement.setNomMotivation("Se confronter à son élément");
		confronterElement.setDescription("Vous cherchez à tout prix à défier votre Élément pour faire Corps avec lui. Selon la nature de celui-ci, vous vous imprégnez de tout ce qui caractérise votre Élément (couleur symbolique, attitude, lieu, manifestation naturelle,...) afin de mieux entrer en contact avec lui. Investi de votre Élément, vous voyagez afin de vous confronter aux manifestations naturelles de celui-ci. Par exemple, un Élémentaliste du Feu parcourra le monde à la recherche de brasiers ou d’incendies auxquels il pourrait se confronter, un Élémentaliste de l’Objet se plaira à arpenter les Cités technologiques afin d’en maîtriser tous les rouages, un Élémentaliste de l’Eau sillonnera les mers en espérant être pris dans des tempêtes et ainsi éprouver son pouvoir sur les eaux,....");
		confronterElement.setDomaineLie(rituels);
		confronterElement = motivationRepository.save(confronterElement);
		
		communier.setNomMotivation("Communier avec d'autres Élémentalistes");
		communier.setDescription("Vous parcourez le monde à la recherche de Maîtres ou de Disciples partageant la même foi en votre Élément afin d’entrer en communion avec eux. C’est grâce à cette dernière que vous pouvez vous ressourcer, devenir meilleur. Les Élémentalistes motivés par la communion sont plus tolérants que les autres et partagent de nombreux points de vue avec les Shaanistes..");
		communier.setDomaineLie(rituels);
		communier = motivationRepository.save(communier);
		
		nourrir.setNomMotivation("Se nourrir");
		nourrir.setDescription("C’est la Motivation la plus essentielle. La plupart du temps, la faim est comblée car vous savez vous organiser. Vous êtes censés prévoir des rations lorsque vous voyagez et pouvez vous rendre dans des auberges ou des restaurants pour vous nourrir. Lorsque vous vous retrouvez en pleine nature et que vous n’avez rien à vous mettre sous la dent, vous vous en remettez à vos connaissances en Survie. Mais si vous n’arrivez pas à trouver de la nourriture, cela peut vous plonger dans un état assez irrationnel où se nourrir devient une priorité absolue. Cet état peut vous rendre très violent. Il n’est pas rare qu’un inoffensif marchand se change en bête féroce et attaque à mains nues un Voyageur qui disposerait de quoi le sustenter. En théorie, vous pouvez jeûner pendant (Corps) jours, mais au-delà, si vous n’avez toujours rien avalé, votre Corps s’affaiblit et le moindre effort devient insurmontable. Vous êtes alors obligé de rester allongé, votre Corps n’ayant plus assez d’énergie pour se déplacer. Difficile alors de chasser dans ces conditions....");
		nourrir.setDomaineLie(survie);
		nourrir = motivationRepository.save(nourrir);
		
		explorer.setNomMotivation("Explorer un territoire");
		explorer.setDescription("Connaître le territoire qui nous entoure et savoir en exploiter les moindres parcelles constitue l’une des Motivations les plus ancestrales, du temps où les peuplades primitives vivaient en Héossie, afin de pouvoir mieux se protéger en cas d’agression, de repérer des ressources potentielles, ou de s’adapter à des conditions climatiques inhabituelles..");
		explorer.setDomaineLie(survie);
		explorer = motivationRepository.save(explorer);
		
		construireVoyage.setNomMotivation("Se construire par le voyage");
		construireVoyage.setDescription("Peu importe la destination, ce qui compte, c’est le voyage. C’est en ce dernier que réside toute l’expérience qu’il est possible d’acquérir lors de situations extrêmes. Amener vos compagnons ou des clients à bon port vous procure une grande fierté et un sentiment d’harmonie avec l’environnement. Les voyages créent des souvenirs, les souvenirs engendrent l’expérience, l’expérience forge la compétence, la compétence crée le statut, qui peut donner lieu à du Prestige. Une fois connu, vous pourrez raconter votre histoire et donner envie à vos auditeurs de voyager à leur tour.");
		construireVoyage.setDomaineLie(survie);
		construireVoyage = motivationRepository.save(construireVoyage);
		
		defierMort.setNomMotivation("Défier la mort");
		defierMort.setDescription("Vous êtes un risque-tout. Vous n’exprimez pleinement votre talent que lorsque votre vie est en danger. La proximité de la mort devient alors pour vous un exutoire que vous recherchez dans le but de vous améliorer sans cesse. Le danger et l’adrénaline qu’il vous procure agissent comme une drogue sur votre organisme. Pendant les longues périodes où votre vie n’est pas menacée, vous vous ennuyez profondément, rongé par l’appel de l’aventure et l’excitation de l’inconnu..");
		defierMort.setDomaineLie(combat);
		defierMort = motivationRepository.save(defierMort);
		
		protegerFaibles.setNomMotivation("Protéger les faibles");
		protegerFaibles.setDescription("Vous avez découvert, souvent à vos dépens, que c’est la loi du plus fort qui gagne bien souvent. Et cela vous insupporte. Par obligation, vous êtes devenu fort à votre tour pour pouvoir défendre toutes les victimes de cette loi impitoyable. Cette voie est très longue car plus vous êtes fort, plus la tâche de protéger ceux qui vous entourent est lourde de responsabilités et chargée en émotions..");
		protegerFaibles.setDomaineLie(combat);
		protegerFaibles = motivationRepository.save(protegerFaibles);
		
		venger.setNomMotivation("Se venger");
		venger.setDescription("Vous avez une blessure d’enfance : la mort violente d’un proche, l’extermination de votre Peuple, les humiliations d’un Notable, le vol d’un bien précieux, la honte sur votre nom, la ruine de votre famille, ou toute autre raison. Vous n’aspirez plus désormais qu’à une seule chose : la vengeance. On dit que c’est un plat qui se mange froid, mais il se prépare dans la fournaise d’une haine féroce qui s’est entretenue jour après jour. La seule issue possible pour vous, c’est de laver votre blessure dans le sang..");
		venger.setDomaineLie(combat);
		venger = motivationRepository.save(venger);
		
		peurGens.setNomMotivation("Faire peur aux gens");
		peurGens.setDescription("Enfant déjà, vous adoriez vous cacher et surgir pour prendre les gens au dépourvu et leur flanquer la peur de leur vie. Avec le temps, ces enfantillages s’estompent, mais pas pour vous. Ce plaisir de faire peur s’est mué en culte de la terreur. Faire peur à l’autre c’est une façon de prendre un peu de son être et de remplir le vide qui vous habite..");
		peurGens.setDomaineLie(necrose);
		peurGens = motivationRepository.save(peurGens);
		
		jouerLoi.setNomMotivation("Jouer avec la loi");
		jouerLoi.setDescription("Les règles vous ont toujours mis mal à l’aise, comme si elles n’étaient faites que pour briser vos rêves et votre liberté. Vous avez donc appris à les contourner et espérez bien continuer à le faire le plus longtemps possible. Les représentants de l’ordre deviennent des partenaires de jeu avec lesquels vous disputez des matchs dont vous décidez des règles et du terrain. Jusqu’à présent, vous avez toujours réussi à vous en sortir... Jusqu’à présent....");
		jouerLoi.setDomaineLie(necrose);
		jouerLoi = motivationRepository.save(jouerLoi);
		
		venererCapital.setNomMotivation("Vénérer le Grand Capital");
		venererCapital.setDescription("Vous êtes un leader, un entrepreneur. Pour vous, les Négociants n’ont rien compris à l’économie. Peu importe ce que l’on vend ou ce que l’on achète, ni à qui l'on s’adresse, seul compte le Grand Capital qu’il faut nourrir coûte que coûte en lui dégageant des bénéfices. Les personnes que vous employez sont en fait des offrandes conditionnées pour sacrifier leurs Âme sur l’autel du dieu numéraire. Vous allez faire fortune car vous avez la foi..");
		venererCapital.setDomaineLie(necrose);
		venererCapital = motivationRepository.save(venererCapital);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	
		ameliorationDefensive.setNomPouvoir("Amélioration Défensive");
		ameliorationDefensive.setRang("Rang 1");
		ameliorationDefensive.setType("Amélioration");
		ameliorationDefensive.setTest("TECHNIQUE");
		ameliorationDefensive.setFrequence("1 fois par Jour");
		ameliorationDefensive.setActivation("1 Action par Cible");
		ameliorationDefensive.setPortee("Contact");
		ameliorationDefensive.setNbCible("(Test de techniques) cibles");
		ameliorationDefensive.setDuree("1 Heure");
		ameliorationDefensive.setDomaineLie(technique);
		ameliorationDefensive.setDescription(
				"Le Novateur peut augmenter de +1 la Protection de Corps de (Test de TECHNIQUE) armures ou boucliers pendant 1 Heure. Chaque armure doit être manipulée par le Novateur pendant 1 Action pour être améliorée.");
		ameliorationDefensive = pouvoirRepository.save(ameliorationDefensive);
		

		ameliorationOffensive.setNomPouvoir("Amélioration Offensive");
		ameliorationOffensive.setRang("Rang 1");
		ameliorationOffensive.setType("Amélioration");
		ameliorationOffensive.setTest("TECHNIQUE");
		ameliorationOffensive.setFrequence("1 fois par Jour");
		ameliorationOffensive.setActivation("1 Action par Cible");
		ameliorationOffensive.setPortee("Contact");
		ameliorationOffensive.setNbCible("(Test de techniques) cibles");
		ameliorationOffensive.setDuree("1 Heure");
		ameliorationOffensive.setDomaineLie(technique);
		ameliorationOffensive.setDescription(
				"Le Novateur peut augmenter de +1 le Bonus que procurent (Test de TECHNIQUE) armes pendant 1 Heure. Chaque arme doit être manipulée par le Novateur pendant 1 Action pour être améliorée. Cette Astuce fonctionne sur les Armes de mêlée, à projectiles, lancées, de corps, et humaines");
		ameliorationOffensive = pouvoirRepository.save(ameliorationOffensive);
		
		
		brisecode.setNomPouvoir("Brisecode");
		brisecode.setRang("Rang 2");
		brisecode.setType("Perception");
		brisecode.setTest("Aucun");
		brisecode.setFrequence("1 fois par Jour");
		brisecode.setActivation("1 Action");
		brisecode.setPortee("Contact");
		brisecode.setNbCible("une");
		brisecode.setDomaineLie(technique);
		brisecode.setDescription(
				"Le Novateur peut décrypter automatiquement des codes d'accès sans avoir recours à une machine. Cette astuce ne fonctionne que sur les systèmes électroniques issus de la technologie humaine (coffre sécurisé, bombe à désamorcer, programme Arpège, communication cryptée,...).");
		brisecode = pouvoirRepository.save(brisecode);
		
		
		personnalisationDeVehicule.setNomPouvoir("Personnalisation De Vehicule");
		personnalisationDeVehicule.setRang("Rang 2");
		personnalisationDeVehicule.setType("Amélioration");
		personnalisationDeVehicule.setTest("TECHNIQUE");
		personnalisationDeVehicule.setFrequence("1 fois par Jour");
		personnalisationDeVehicule.setActivation("1 Heure");
		personnalisationDeVehicule.setPortee("Contact");
		personnalisationDeVehicule.setNbCible("Unique (1 fois par cible)");
		personnalisationDeVehicule.setDuree("Permanente");
		personnalisationDeVehicule.setDomaineLie(technique);
		personnalisationDeVehicule.setDescription(
				"Le Novateur peut augmenter la capacité d'accueil d'un véhicule de (Test de TECHNIQUE)/3 places. Ce pouvoir n'est utilisable qu'une seule fois par véhicule.");
		personnalisationDeVehicule = pouvoirRepository.save(personnalisationDeVehicule);
	
		
		clairvoyance.setNomPouvoir("Clairvoyance");
		clairvoyance.setRang("Rang 1");
		clairvoyance.setType("Perception");
		clairvoyance.setTest("Aucun");
		clairvoyance.setFrequence("Permanente");
		clairvoyance.setActivation("1 Geste");
		clairvoyance.setPortee("Personnel");
		clairvoyance.setDomaineLie(savoir);
		clairvoyance.setDescription(
				"L'Érudit peut utiliser son niveau de SAVOIR à la place du niveau de SHAAN pour déterminer son initiative lors d'une Confrontation.");
		clairvoyance = pouvoirRepository.save(clairvoyance);
		
		
		connaissancePartagee.setNomPouvoir("Connaissance Partagée");
		connaissancePartagee.setRang("Rang 1");
		connaissancePartagee.setType("Amélioration");
		connaissancePartagee.setTest("SAVOIR");
		connaissancePartagee.setFrequence("1 fois par Jour");
		connaissancePartagee.setActivation("2 Actions");
		connaissancePartagee.setPortee("Interaction");
		connaissancePartagee.setNbCible("SAVOIR cibles");
		connaissancePartagee.setDomaineLie(savoir);
		connaissancePartagee.setDescription(
				"L'Érudit accorde un Bonus de +(Test de SAVOIR) pour une Épreuve de SAVOIR en Coopération impliquant jusqu'à SAVOIR alliés.");
		connaissancePartagee = pouvoirRepository.save(connaissancePartagee);
		
		
		apprentissageAccelere.setNomPouvoir("Apprentissage Acceleré");
		apprentissageAccelere.setRang("Rang 2");
		apprentissageAccelere.setType("Amélioration");
		apprentissageAccelere.setTest("Aucun");
		apprentissageAccelere.setFrequence("1 fois par Transition");
		apprentissageAccelere.setActivation("1 Geste");
		apprentissageAccelere.setPortee("Personnel");
		apprentissageAccelere.setDomaineLie(savoir);
		apprentissageAccelere.setDescription(
				"L’Érudit peut diviser les durées d'enseignement par 2, qu’il apprenne d’un maître ou qu’il enseigne à un apprenti.");
		apprentissageAccelere = pouvoirRepository.save(apprentissageAccelere);
		
		
		controleDeLAdministration.setNomPouvoir("Contrôle De L'Administration");
		controleDeLAdministration.setRang("Rang 2");
		controleDeLAdministration.setType("Altération");
		controleDeLAdministration.setTest("Aucun");
		controleDeLAdministration.setFrequence("1 fois par Transition");
		controleDeLAdministration.setActivation("1 Heure");
		controleDeLAdministration.setPortee("Interaction");
		controleDeLAdministration.setDomaineLie(savoir);
		controleDeLAdministration.setDescription(
				"L’Érudit a des facilités pour naviguer dans les administrations les plus inertes. Il peut en accélérer les délais, en décoincer les rouages, en divisant les durées normales d’attente par 2. Au contraire, il peut bloquer un processus administratif (procès, inspection,...) en multipliant sa durée par 2. S'il est nécessaire de quantifier le temps plus précisément, on considère que ce Secret peut être activé 1 fois par Semaine.");
		controleDeLAdministration = pouvoirRepository.save(controleDeLAdministration);
		
		
		allieProvidentiel.setNomPouvoir("Allié Providentiel");
		allieProvidentiel.setRang("Rang 1");
		allieProvidentiel.setType("Invocation");
		allieProvidentiel.setTest("Aucun");
		allieProvidentiel.setFrequence("1 fois par Jour");
		allieProvidentiel.setActivation("1 Action");
		allieProvidentiel.setPortee("Interaction");
		allieProvidentiel.setDuree("1 Situation");
		allieProvidentiel.setDomaineLie(social);
		allieProvidentiel.setDescription(
				"Lorsque le Négociant est dans une ville et qu'il est menacé, un allié providentiel vient automatiquement s'interposer. Pour déterminer les caractéristiques de l'allié, le joueur tire 3D10. Chaque dé correspond à la valeur actuelle du Trihn correspondant. Cet allié ne peut faire que des attaques physiques.");
		allieProvidentiel = pouvoirRepository.save(allieProvidentiel);
		

		chanceAuJeu.setNomPouvoir("Chance Au Jeu");
		chanceAuJeu.setRang("Rang 1");
		chanceAuJeu.setType("Récupération");
		chanceAuJeu.setTest("SOCIAL");
		chanceAuJeu.setFrequence("1 fois par Jour");
		chanceAuJeu.setActivation("1 Heure");
		chanceAuJeu.setPortee("Personnel");
		chanceAuJeu.setDomaineLie(social);
		chanceAuJeu.setDescription(
				"Le Négociant gagne (Test de SOCIAL) x 10 Crédos quand il va jouer dans une salle de jeu pendant au moins 1 Heure.");
		chanceAuJeu = pouvoirRepository.save(chanceAuJeu);
		
		
		achatDuSiecle.setNomPouvoir("Achat Du Siècle");
		achatDuSiecle.setRang("Rang 2");
		achatDuSiecle.setType("Contrôle");
		achatDuSiecle.setTest("SOCIAL");
		achatDuSiecle.setFrequence("1 fois par Jour");
		achatDuSiecle.setActivation("1 Test toutes les 15 Minutes");
		achatDuSiecle.setPortee("Interaction");
		achatDuSiecle.setCible("Esprit");
		achatDuSiecle.setNbCible("unique (1 fois par cible)");
		achatDuSiecle.setDomaineLie(social);
		achatDuSiecle.setDescription(
				"Le Négociant peut acheter quelque chose à un prix défiant toute concurrence contre la volonté de la cible. Il lance un (Test de SOCIAL) par 15 minutes de négociation pour dépasser la Défense d'Esprit de la cible. Le prix de base du produit est réduit de Réussite x 10%. Ce Privilège ne fonctionne qu’une seule fois par cible.");
		achatDuSiecle = pouvoirRepository.save(achatDuSiecle);
		;
		
		allianceForcee.setNomPouvoir("Alliance Forcée");
		allianceForcee.setRang("Rang 2");
		allianceForcee.setType("Contrôle");
		allianceForcee.setTest("SOCIAL");
		allianceForcee.setFrequence("1 fois par Jour");
		allianceForcee.setActivation("1 Jour");
		allianceForcee.setPortee("Interaction");
		allianceForcee.setCible("Esprit");
		allianceForcee.setNbCible("deux");
		allianceForcee.setDuree("1 Transition");
		allianceForcee.setDomaineLie(social);
		allianceForcee.setDescription(
				"Le Négociant peut réconcilier deux ennemis. Il doit réussir une Épreuve de SOCIAL en effectuant un Test de SOCIAL par Jour dont la Difficulté est égale à la somme des deux Esprits de ses cibles.");
		allianceForcee = pouvoirRepository.save(allianceForcee);
		
		
		chantArcanique.setNomPouvoir("Chant Arcanique");
		chantArcanique.setRang("Rang 1");
		chantArcanique.setType("Amélioration");
		chantArcanique.setTest("Aucun");
		chantArcanique.setFrequence("1 fois par Tour");
		chantArcanique.setActivation("1 Geste");
		chantArcanique.setPortee("Interaction");
		chantArcanique.setCible("ARTS cibles");
		chantArcanique.setDuree("1 Tour");
		chantArcanique.setDomaineLie(arts);
		chantArcanique.setDescription(
				"L’Artiste peut donner un Bonus de +1 à ARTS alliés (dont lui-même), utilisable pour les Actions de MAGIE réalisées pendant que l'Artiste chante.");
		chantArcanique = pouvoirRepository.save(chantArcanique);
		

		chantDeBataille.setNomPouvoir("Chant De Bataille");
		chantDeBataille.setRang("Rang 1");
		chantDeBataille.setType("Amélioration");
		chantDeBataille.setTest("Aucun");
		chantDeBataille.setFrequence("1 fois par Tour");
		chantDeBataille.setActivation("1 Geste");
		chantDeBataille.setPortee("Interaction");
		chantDeBataille.setCible("ARTS cibles");
		chantDeBataille.setDuree("1 Tour");
		chantDeBataille.setDomaineLie(arts);
		chantDeBataille.setDescription(
				"L’Artiste peut donner un Bonus de +1 à ARTS alliés (dont lui-même), utilisable pour les Actions de COMBAT réalisées pendant que l'Artiste chante.");
		chantDeBataille = pouvoirRepository.save(chantDeBataille);
		

		absurdite.setNomPouvoir("Absurdité");
		absurdite.setRang("Rang 2");
		absurdite.setType("Altération");
		absurdite.setTest("ARTS");
		absurdite.setFrequence("1 fois par Situation");
		absurdite.setActivation("1 Test par Action");
		absurdite.setPortee("Interaction");
		absurdite.setCible("Esprit");
		absurdite.setNbCible("une");
		absurdite.setDuree("Réussite Tours");
		absurdite.setDomaineLie(arts);
		absurdite.setDescription(
				"L'Artiste emploie un humour par l'absurde, qui plonge une cible dans un état d'incompréhension. Il lance un Test d'ARTS par Action pour dépasser la Défense d'Esprit de sa cible. Celle-ci subit alors un Malus de Réussite à sa Défense d'Esprit pendant Réussite Tours.");
		absurdite = pouvoirRepository.save(absurdite);
		

		chantDExaltation.setNomPouvoir("Chant D'Exaltation");
		chantDExaltation.setRang("Rang 2");
		chantDExaltation.setType("Défense");
		chantDExaltation.setTest("Aucun");
		chantDExaltation.setFrequence("1 fois par Tour");
		chantDExaltation.setActivation("1 Geste");
		chantDExaltation.setPortee("Interaction");
		chantDExaltation.setNbCible("une");
		chantDExaltation.setDuree("1 Tour");
		chantDExaltation.setDomaineLie(arts);
		chantDExaltation.setDescription(
				"L'Artiste exalte une cible pour qu'elle s'affranchisse de ses limites physiques. Tant qu'elle est exaltée par ce chant, et même si elle est blessée physiquement, la cible prend toujours la valeur maximum de son Trihn de Corps (au lieu de la valeur actuelle) pour calculer sa Défense de Corps.");
		chantDExaltation = pouvoirRepository.save(chantDExaltation);
		

		brulureDAntiAme.setNomPouvoir("Brulure D'Anti-âme");
		brulureDAntiAme.setRang("Rang 1");
		brulureDAntiAme.setType("Attaque");
		brulureDAntiAme.setTest("SHAAN");
		brulureDAntiAme.setFrequence("1 fois par Tour");
		brulureDAntiAme.setActivation("1 Test par Action");
		brulureDAntiAme.setPortee("Interaction");
		brulureDAntiAme.setCible("Anti-Ame");
		brulureDAntiAme.setNbCible("une");
		brulureDAntiAme.setDegats("corps");
		brulureDAntiAme.setDomaineLie(shaan);
		brulureDAntiAme.setDescription(
				"Le Shaaniste lance une attaque en interaction sur un Nécrosien (individu à Âme négative) en effectuant un (Test de SHAAN) par Action pour passer la Défense d’Anti-Âme du Nécrosien. Sa Réussite détermine la gravité de la blessure qu’il inflige à l’Anti-Âme du Nécrosien. Si ce dernier possède un Corps, la Brûlure inflige aussi une blessure de même gravité au Corps du Nécrosien.");
		brulureDAntiAme = pouvoirRepository.save(brulureDAntiAme);
		

		coupDeChance.setNomPouvoir("Coup De Chance");
		coupDeChance.setRang("Rang 1");
		coupDeChance.setType("Altération");
		coupDeChance.setTest("Aucun");
		coupDeChance.setFrequence("1 fois par Jour");
		coupDeChance.setActivation("1 Geste");
		coupDeChance.setPortee("Personnel");
		coupDeChance.setDomaineLie(shaan);
		coupDeChance.setDescription(
				"Le joueur du Shaaniste peut relancer ses 3 dés lors de n’importe quel Test, si leur résultat ne lui convient pas.");
		coupDeChance = pouvoirRepository.save(coupDeChance);
		

		agressionPersonnelle.setNomPouvoir("Agression Personnelle");
		agressionPersonnelle.setRang("Rang 2");
		agressionPersonnelle.setType("Défense");
		agressionPersonnelle.setTest("Aucun");
		agressionPersonnelle.setFrequence("1 fois par Situation");
		agressionPersonnelle.setActivation("1 Geste");
		agressionPersonnelle.setPortee("Contact");
		agressionPersonnelle.setNbCible("une");
		agressionPersonnelle.setDuree("(Test de SHAAN) Tours");
		agressionPersonnelle.setDomaineLie(shaan);
		agressionPersonnelle.setDescription(
				"L’adversaire qui devait blesser le Shaaniste se porte finalement l’attaque à lui-même. La cible est étourdie pendant SHAAN Tours de jeu (Malus de -1 à toutes ses Actions et Défenses). Le Shaaniste peut activer cette Symbiose en réaction à l’Action de sa cible s’il n’a pas déjà utilisé son Geste du Tour.");
		agressionPersonnelle = pouvoirRepository.save(agressionPersonnelle);
		

		amitieForcee.setNomPouvoir("Amitié Forcée");
		amitieForcee.setRang("Rang 2");
		amitieForcee.setType("Contrôle");
		amitieForcee.setTest("SHAAN");
		amitieForcee.setFrequence("1 fois par Situation");
		amitieForcee.setActivation("1 Test par Action");
		amitieForcee.setPortee("Interaction");
		amitieForcee.setCible("Esprit");
		amitieForcee.setNbCible("une");
		amitieForcee.setDuree("Réussite Tours");
		amitieForcee.setDomaineLie(shaan);
		amitieForcee.setDescription(
				"Le Shaaniste choisi une cible ennemie, en interaction avec un adversaire qui attaque le Shaaniste et ses alliés. Il lance un (Test de SHAAN) par Action pour dépasser la Défense d'Esprit de la Cible. Celle-ci se met alors à défendre le Shaaniste et ses alliés pendant Réussite Tours de jeu. Si la cible est attaquée par un allié du Shaaniste, l'Amitié Forcée est désactivée.");
		amitieForcee = pouvoirRepository.save(amitieForcee);
		

		armeMagique.setNomPouvoir("Arme Magique");
		armeMagique.setRang("Rang 1");
		armeMagique.setType("Invocation");
		armeMagique.setTest("MAGIE + Trihn");
		armeMagique.setFrequence("1 fois par Situation");
		armeMagique.setActivation("1 Action");
		armeMagique.setPortee("Personnel");
		armeMagique.setCout("1 Trihn de Corps");
		armeMagique.setDomaineLie(magie);

		armeMagique.setDuree("1 Situation");
		armeMagique.setDescription(
				"Le Magicien matérialise une arme de Mêlée de l’apparence de son choix qui apporte un Bonus de (Test de MAGIE)/3 aux Tests de COMBAT + Armes de Mêlée. Il est le seul à pouvoir l'utiliser, et elle disparait à la fin de la Situation.");
		armeMagique = pouvoirRepository.save(armeMagique);
		
		attaqueTrihnique.setNomPouvoir("Attaque Trihnique");
		attaqueTrihnique.setRang("Rang 1");
		attaqueTrihnique.setType("Attaque");
		attaqueTrihnique.setTest("MAGIE + Trihn");
		attaqueTrihnique.setFrequence("1 fois par Tour");
		attaqueTrihnique.setActivation("1 Action");
		attaqueTrihnique.setPortee("Interaction");
		attaqueTrihnique.setCible("Trihn ciblé");
		attaqueTrihnique.setNbCible("une");
		attaqueTrihnique.setDegats("trihn");
		attaqueTrihnique.setCout("1 Trihn au choix selon le trihn ciblé");
		attaqueTrihnique.setDomaineLie(magie);
		attaqueTrihnique.setDescription(
				"Le Magicien peut utiliser l’énergie trihnique pour porter une attaque sur une cible en Interaction. Le type de Trihn consumé pour lancer l’attaque détermine le Trihn ciblé et la Défense à dépasser avec un (Test de MAGIE).");
		attaqueTrihnique = pouvoirRepository.save(attaqueTrihnique);
		

		champDeForce.setNomPouvoir("Champ De Force");
		champDeForce.setRang("Rang 2");
		champDeForce.setType("Altération");
		champDeForce.setTest("MAGIE + Trihn");
		champDeForce.setFrequence("1 fois par Jour");
		champDeForce.setActivation("1 Action");
		champDeForce.setPortee("Interaction");
		champDeForce.setCible("Trihn ciblé");
		champDeForce.setNbCible("MAGIE cibles");
		champDeForce.setCout("1 Trihn au choix selon le type de malus");
		champDeForce.setDomaineLie(magie);
		champDeForce.setDuree("Réussite Tours");
		champDeForce.setDescription(
				"Le Magicien crée un champ de force qui gène MAGIE cibles dont la Défense de Trihn est inférieure à son (Test de MAGIE). Elles subissent un Malus de Réussite aux Test de Domaines liés au Trihn consumé par le Magicien pendant Réussite Tours.");
		champDeForce = pouvoirRepository.save(champDeForce);
		

		croissance.setNomPouvoir("Croissance");
		croissance.setRang("Rang 2");
		croissance.setType("Amélioration");
		croissance.setTest("MAGIE + Trihn");
		croissance.setFrequence("1 fois par Situation");
		croissance.setActivation("1 Action");
		croissance.setPortee("Personnel");
		croissance.setCout("1 Trihn de Corps");
		croissance.setDuree("Réussite Tours");
		croissance.setDomaineLie(magie);
		croissance.setDescription(
				"Le Magicien développe sa masse physique et grandit considérablement : sa taille est augmentée de (Test de MAGIE) x 10%. Sa valeur de Corps est augmentée de (Test de MAGIE)/3 et son niveau de COMBAT augmente de 2.");
		croissance = pouvoirRepository.save(croissance);
		

		alarmeElementaire.setNomPouvoir("Alarme Elementaire");
		alarmeElementaire.setRang("Rang 1");
		alarmeElementaire.setType("Perception");
		alarmeElementaire.setTest("RITUELS + Rite");
		alarmeElementaire.setFrequence("1 fois par Jour");
		alarmeElementaire.setActivation("2 Actions ou 1 Action + 1 point de Corps");
		alarmeElementaire.setPortee("Distance");
		alarmeElementaire.setDuree("(Test de RITUELS) Heures");
		alarmeElementaire.setDomaineLie(rituels);
		alarmeElementaire.setDescription(
				"L'Élémentaliste se met en état de sentir le danger. Durant le pouvoir, le personnage sera averti par son élément de tout danger se présentant à lui dans un rayon de (Test de RITUELS) x 100 mètres. La nature de ce danger restera vague mais le personnage saura quelle est sa nature élémentaire (s'il s'agit d'un animal, d'un minéral, d'un végétal, d'un humain, d'un nécrosien, d'un anthéen...). La nature du danger est indépendante de l'élément prié : une Transe à l'Objet pourra très bien anticiper une agression animale. Pendant la durée de l'alerte, l'Élémentaliste peut également utiliser son niveau de RITUELS à la place du niveau de SHAAN pour déterminer son initiative lors d'une Confrontation. Il bénéficie également d'un Bonus de (Test de RITUELS)/3 pour détecter une embuscade.");
		alarmeElementaire = pouvoirRepository.save(alarmeElementaire);
		

		apaisementElementaire.setNomPouvoir("Apaisement Elementaire");
		apaisementElementaire.setRang("Rang 1");
		apaisementElementaire.setType("Contrôle");
		apaisementElementaire.setTest("RITUELS + Rite");
		apaisementElementaire.setFrequence("1 fois par Situation");
		apaisementElementaire.setActivation("1 Test toutes les 2 Actions ou 1 Test et -1 point de Corps par Action");
		apaisementElementaire.setPortee("Interaction");
		apaisementElementaire.setCible("Trihn ciblé");
		apaisementElementaire.setNbCible("une");
		apaisementElementaire.setDuree("Réussite Tours");
		apaisementElementaire.setDomaineLie(rituels);
		apaisementElementaire.setDescription(
				"L'Élémentaliste peut calmer un élément : un animal fougueux (Animal), une plante agressive ou vénéneuse (Végétal), une tempête (Air), une peur ou phobie personnelle (Moi), une personne hystérique ou en colère (Lui), un tremblement de terre (Terre), une machine qui s'emballe (Objet), un feu qui se propage (Feu), une noyade (Eau), ou un nécrosé (Limbes). L'Élémentaliste effectue un (Test de RITUELS) toutes les 2 Actions pour dépasser la meilleure Défense de la cible. Celle-ci ne pourra alors plus attaquer pendant Réussite Tours. La cible peut être attaquée pendant la durée de cette Transe, cela ne la désactivera pas comme c'est le cas pour les Symbioses des Shaanistes par exemple...");
		apaisementElementaire = pouvoirRepository.save(apaisementElementaire);
		

		blocageElementaire.setNomPouvoir("Blocage Elementaire");
		blocageElementaire.setRang("Rang 2");
		blocageElementaire.setType("Contrôle");
		blocageElementaire.setTest("RITUELS + Rite");
		blocageElementaire.setFrequence("1 fois par Situation");
		blocageElementaire.setActivation("1 Test toutes les 2 Actions ou 1 Test et -1 point de Corps par Action");
		blocageElementaire.setPortee("Interaction");
		blocageElementaire.setCible("Esprit");
		blocageElementaire.setNbCible("une");
		blocageElementaire.setDuree("2 Tours");
		blocageElementaire.setDomaineLie(rituels);
		blocageElementaire.setDescription(
				"L'Élémentaliste lance un (Test de RITUELS) toutes les 2 Actions pour dépasser la Défense d'Esprit de sa cible. Il peut alors lui interdire l'utilisation du Domaine correspondant à l'élément prié pendant 2 Tours.");
		blocageElementaire = pouvoirRepository.save(blocageElementaire);
		

		bouclierElementaire.setNomPouvoir("Bouclier Elementaire");
		bouclierElementaire.setRang("Rang 2");
		bouclierElementaire.setType("Défense");
		bouclierElementaire.setTest("RITUELS + Rite");
		bouclierElementaire.setFrequence("1 fois par Situation");
		bouclierElementaire.setActivation("2 Actions ou 1 Action + 1 point de Corps");
		bouclierElementaire.setPortee("Interaction");
		bouclierElementaire.setNbCible("(Test de RITUELS) cibles");
		bouclierElementaire.setDuree("1 Situation");
		bouclierElementaire.setDomaineLie(rituels);
		bouclierElementaire.setDescription(
				"L'Élémentaliste élève un bouclier fait de poils, d'os, de griffes et de hurlements, de feu, d'eau, de mécanismes, d'individus… Ce bouclier fournit une Protection éphémère qui permet d'annuler la perte de (Test de RITUELS) points de Corps pour lui et ses alliés.");
		bouclierElementaire = pouvoirRepository.save(bouclierElementaire);
		

		ameDuChasseur.setNomPouvoir("Ame Du Chasseur");
		ameDuChasseur.setRang("Rang 1");
		ameDuChasseur.setType("Amélioration");
		ameDuChasseur.setTest("Aucun");
		ameDuChasseur.setFrequence("1 fois par Situation");
		ameDuChasseur.setActivation("1 Geste");
		ameDuChasseur.setPortee("Personnel");
		ameDuChasseur.setDomaineLie(survie);
		ameDuChasseur.setDescription(
				"Le Voyageur ne fait plus qu'un avec son Arme lancée ou à projectiles. Il peut utiliser un dé non-Actif sans dépenser de point de Trihn pour effectuer un Test de COMBAT + Armes lancées ou Armes à projectiles.");
		ameDuChasseur = pouvoirRepository.save(ameDuChasseur);
		

		appelDeLaMonture.setNomPouvoir("Appel De La Monture");
		appelDeLaMonture.setRang("Rang 1");
		appelDeLaMonture.setType("Invocation");
		appelDeLaMonture.setTest("SURVIE");
		appelDeLaMonture.setFrequence("1 fois par Jour");
		appelDeLaMonture.setActivation("1 Action");
		appelDeLaMonture.setPortee("Horizon");
		appelDeLaMonture.setNbCible("une");
		appelDeLaMonture.setDuree("(Test de SURVIE) Heures");
		appelDeLaMonture.setDomaineLie(survie);
		appelDeLaMonture.setDescription(
				"Le Voyageur peut siffler pour appeler une monture dressée ou à l'état sauvage. Si un animal pouvant servir de monture se trouve à moins de (Test de SURVIE) km, il rejoindra le Voyageur dans les plus brefs délais si cela est possible pour lui, et pourra être monté par le Voyageur pendant (Test de SURVIE) Heures. En fonction de l'animal appelé, le meneur de jeu pourra imposer une Difficulté aux Tests de SURVIE + Monture.");
		appelDeLaMonture = pouvoirRepository.save(appelDeLaMonture);
		

		accelererLeVoyage.setNomPouvoir("Accelerer Le Voyage");
		accelererLeVoyage.setRang("Rang 2");
		accelererLeVoyage.setType("Déplacement");
		accelererLeVoyage.setTest("Aucun");
		accelererLeVoyage.setFrequence("Permanente");
		accelererLeVoyage.setActivation("1 Geste");
		accelererLeVoyage.setPortee("Interaction");
		accelererLeVoyage.setNbCible("SURVIE cibles");
		accelererLeVoyage.setDomaineLie(survie);
		accelererLeVoyage.setDescription(
				"Le Voyageur, lorsqu'il guide un convoi, peut doubler la vitesse de déplacement de ce convoi.");
		accelererLeVoyage = pouvoirRepository.save(accelererLeVoyage);

		appelDeLAnimal.setNomPouvoir("Appel De L'Animal");
		appelDeLAnimal.setRang("Rang 2");
		appelDeLAnimal.setType("Invocation");
		appelDeLAnimal.setTest("SURVIE");
		appelDeLAnimal.setFrequence("1 fois par Jour");
		appelDeLAnimal.setActivation("1 Action");
		appelDeLAnimal.setPortee("Horizon");
		appelDeLAnimal.setNbCible("une");
		appelDeLAnimal.setDuree("1 Jour");
		appelDeLAnimal.setDomaineLie(survie);
		appelDeLAnimal.setDescription(
				"Le Voyageur imite le cri d’un gros animal local pour l’appeler. Un animal se trouvant à moins de (Test de SURVIE) km rejoint le Voyageur. Ce dernier pourra utiliser les capacités de l’animal qui réagira comme s’il était apprivoisé. L’animal pourra ainsi défendre le Voyageur, lui servir de monture, le guider vers un abri, porter un message… Une fois le temps de contrôle écoulé, l’animal redevient sauvage, et pourra même attaquer le Voyageur ou ses alliés.");
		appelDeLAnimal = pouvoirRepository.save(appelDeLAnimal);
		

		auraGuerriere.setNomPouvoir("Aura Guerriere");
		auraGuerriere.setRang("Rang 1");
		auraGuerriere.setType("Amélioration");
		auraGuerriere.setTest("Aucun");
		auraGuerriere.setFrequence("1 fois par Situation");
		auraGuerriere.setActivation("1 Geste");
		auraGuerriere.setPortee("Personnel");
		auraGuerriere.setDomaineLie(combat);
		auraGuerriere.setDescription(
				"Le Combattant peut utiliser un dé non-Actif sans dépenser de point de Trihn sur un Test de COMBAT + Intimidation pour impressionner ses cibles.");
		auraGuerriere = pouvoirRepository.save(auraGuerriere);
		

		criDeGuerre.setNomPouvoir("Cri De Guerre");
		criDeGuerre.setRang("Rang 1");
		criDeGuerre.setType("Amélioration");
		criDeGuerre.setTest("COMBAT");
		criDeGuerre.setFrequence("1 fois par Tour");
		criDeGuerre.setActivation("1 Action");
		criDeGuerre.setPortee("Interaction");
		criDeGuerre.setNbCible("(Test de COMBAT) cibles");
		criDeGuerre.setDomaineLie(combat);
		criDeGuerre.setDuree("1 Tour");
		criDeGuerre.setDescription(
				"Le Combattant peut répartir (Test de COMBAT) Bonus entre lui-même et ses alliés. Ces Bonus pourront être utilisés pour améliorer leur prochain Test de COMBAT.");
		criDeGuerre = pouvoirRepository.save(criDeGuerre);
		
		
		attaqueTerrifiante.setNomPouvoir("Attaque Terrifiante");
		attaqueTerrifiante.setRang("Rang 2");
		attaqueTerrifiante.setType("Attaque");
		attaqueTerrifiante.setTest("Aucun");
		attaqueTerrifiante.setFrequence("1 fois par Jour");
		attaqueTerrifiante.setActivation("1 Geste");
		attaqueTerrifiante.setPortee("Personnel");
		attaqueTerrifiante.setDegats("esprit");
		attaqueTerrifiante.setDomaineLie(combat);
		attaqueTerrifiante.setDescription(
				"Si le Combattant inflige une blessure physique lors d’un Test de COMBAT, le coup du Combattant inflige une blessure de même gravité à l’Esprit de sa cible.");
		attaqueTerrifiante = pouvoirRepository.save(attaqueTerrifiante);
		
		
		chargeHeroique.setNomPouvoir("Charge Héroique");
		chargeHeroique.setRang("Rang 2");
		chargeHeroique.setType("Déplacement");
		chargeHeroique.setTest("Aucun");
		chargeHeroique.setFrequence("1 fois par Situation");
		chargeHeroique.setActivation("1 Geste");
		chargeHeroique.setPortee("Personnel");
		chargeHeroique.setDomaineLie(combat);
		chargeHeroique.setDescription(
				"Le Combattant peut effectuer un déplacement de Corps mètres en plus d'une Action de COMBAT. Le Combattant bénéficie en plus, pour cette attaque, d’un Bonus égal à son niveau de COMBAT/2, grâce à l’effet de surprise.");
		chargeHeroique = pouvoirRepository.save(chargeHeroique);
		

		affaiblissement.setNomPouvoir("Affaiblissement");
		affaiblissement.setRang("Rang 1");
		affaiblissement.setType("Attaque");
		affaiblissement.setTest("NÉCROSE + Anti-Âme");
		affaiblissement.setFrequence("1 fois par Tour");
		affaiblissement.setActivation("1 Action");
		affaiblissement.setPortee("Interaction");
		affaiblissement.setCible("Corps");
		affaiblissement.setNbCible("NÉCROSE cibles");
		affaiblissement.setDegats("corps");
		affaiblissement.setCout("Une Anti-Âme");
		affaiblissement.setDomaineLie(necrose);
		affaiblissement.setDescription(
				"L'Ombre fait perdre 2 points de Corps à NÉCROSE cibles dont la Défense de Corps est inférieure à son (Test de NÉCROSE).");
		affaiblissement = pouvoirRepository.save(affaiblissement);
		

		animerLesMorts.setNomPouvoir("Animer Les Morts");
		animerLesMorts.setRang("Rang 1");
		animerLesMorts.setType("Invocation");
		animerLesMorts.setTest("NÉCROSE + Anti-Âme");
		animerLesMorts.setFrequence("1 fois par Jour");
		animerLesMorts.setActivation("2 Actions");
		animerLesMorts.setPortee("Interaction");
		animerLesMorts.setCout("Une Anti-Âme");
		animerLesMorts.setDomaineLie(necrose);
		animerLesMorts.setDuree("1 Jour");
		animerLesMorts.setDescription(
				"L'Ombre peut relever un mort et s'en faire un allié pour qu'il attaque une cible. Le cadavre a les caractéristiques suivantes : Corps (Test de NÉCROSE) Esprit 0 Âme 0. Il reste debout jusqu'à ce que l'Ombre s'endorme. Il est insensible aux attaques d'Esprit et d'Âme et ne peut faire que des attaques de Corps.");
		animerLesMorts = pouvoirRepository.save(animerLesMorts);
		
		
		alterationDeSouvenirs.setNomPouvoir("Alteration De Souvenirs");
		alterationDeSouvenirs.setRang("Rang 2");
		alterationDeSouvenirs.setType("Contrôle");
		alterationDeSouvenirs.setTest("NÉCROSE + Anti-Âme");
		alterationDeSouvenirs.setFrequence("1 fois par Jour");
		alterationDeSouvenirs.setActivation("1 Action");
		alterationDeSouvenirs.setPortee("Contact");
		alterationDeSouvenirs.setCible("Esprit");
		alterationDeSouvenirs.setNbCible("une");
		alterationDeSouvenirs.setCout("Une Anti-Âme");
		alterationDeSouvenirs.setDomaineLie(necrose);
		alterationDeSouvenirs.setDuree("1 Jour");
		alterationDeSouvenirs.setDescription(
				"L'Ombre peut altérer les souvenirs d'une victime pour en modifier la teneur : elle lance un (Test de NÉCROSE) pour dépasser la Défense d'Esprit de la cible. Elle pourra alors changer Réussite mots clefs en relation avec un souvenir particulier de la cible.");
		alterationDeSouvenirs = pouvoirRepository.save(alterationDeSouvenirs);
		

		contagionNovice.setNomPouvoir("Contagion Novice");
		contagionNovice.setRang("Rang 2");
		contagionNovice.setType("Attaque");
		contagionNovice.setTest("NÉCROSE");
		contagionNovice.setFrequence("1 fois par Jour");
		contagionNovice.setActivation("1 Action");
		contagionNovice.setPortee("Interaction");
		contagionNovice.setCible("Corps");
		contagionNovice.setNbCible("NÉCROSE cibles");
		contagionNovice.setDegats("corps");
		contagionNovice.setDuree("Réussite Tours");
		contagionNovice.setDomaineLie(necrose);
		contagionNovice.setDescription(
				"L'Ombre peut créer autour de lui une zone hautement contaminée de (Test de NÉCROSE) mètres de rayon. NÉCROSE cibles présentes dans cette zone perdent 1 point de Corps par Tour pendant Réussite Tours, si leur Défense de Corps est inférieure à son (Test de NÉCROSE). Le nuage corrosif se dissipe au bout de (Test de NÉCROSE) Tours. Les nécrosiens ne subissent pas ce Tourment.");
		contagionNovice = pouvoirRepository.save(contagionNovice);
		

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	
		brevet.setNom("Brevet");
		brevet.setCategorie("Richesse");
		brevet.setClasse(1);
		brevet.setValeur(500);
		brevet.setDescription("Récompense offerte par un maître Novateur pour saluer une invention marquante.");
		brevet.setPrestige(1);
		brevet.setType("Acquis du quotidien");
		brevet.setDomaine(technique);
		brevet=acquisRepository.save(brevet);
		
		lanceClous.setNom("Lance-clous");
		lanceClous.setCategorie("Armement");
		lanceClous.setClasse(1);
		lanceClous.setValeur(200);
		lanceClous.setDescription("Le Lance-clous se présente sous la forme d'une petite boîte métallique qui se manipule à deux mains et qui permet de propulser des petits projectiles métalliques.");
		lanceClous.setType("Acquis du quotidien");
		lanceClous.setDomaine(technique);
		SpecialisationAcquis lanceClousSpe = new SpecialisationAcquis(armesAProjectiles,lanceClous,1);	
		lanceClous=acquisRepository.save(lanceClous);
		lanceClousSpe=speAcquisRepository.save(lanceClousSpe);
		
		herbier.setNom("Herbier");
		herbier.setCategorie("Manuscrit");
		herbier.setClasse(1);
		herbier.setValeur(200);
		herbier.setPrestige(1);
		herbier.setDescription("La flore d'Héos");
		herbier.setType("Manuscrit de classe 1");
		herbier.setDomaine(savoir);
		SpecialisationAcquis herbierSpe = new SpecialisationAcquis(botanique, herbier,1);
		herbier=acquisRepository.save(herbier);
		herbierSpe=speAcquisRepository.save(herbierSpe);
		
		livreDesBetes.setNom("Livre des Bêtes");
		livreDesBetes.setCategorie("Manuscrit");
		livreDesBetes.setClasse(3);
		livreDesBetes.setValeur(1800);
		livreDesBetes.setPrestige(3);
		livreDesBetes.setDescription("Composé de 7 volumes.");
		livreDesBetes.setType("Manuscrit de classe 3");
		livreDesBetes.setDomaine(savoir);
		SpecialisationAcquis livreDesBetesSpe1 = new SpecialisationAcquis(zoologie, livreDesBetes, 2);
		SpecialisationAcquis livreDesBetesSpe2 = new SpecialisationAcquis(vieSauvage, livreDesBetes, 1);
		livreDesBetes=acquisRepository.save(livreDesBetes);
		livreDesBetesSpe1=speAcquisRepository.save(livreDesBetesSpe1);
		livreDesBetesSpe2=speAcquisRepository.save(livreDesBetesSpe2);
		
		maquillageTribal.setNom("Maquillage tribal");
		maquillageTribal.setCategorie("Artefact");
		maquillageTribal.setClasse(1);
		maquillageTribal.setValeur(500);
		maquillageTribal.setPrestige(2);
		maquillageTribal.setDomaine(social);
		maquillageTribal.setDescription("Peintures, grigris, et autres parures tribales.");
		maquillageTribal.setType("Artefact,encens et élixirs");
		SpecialisationAcquis maquillageTribalSpe = new SpecialisationAcquis(langagePrimal, maquillageTribal,1);
		maquillageTribal=acquisRepository.save(maquillageTribal);
		maquillageTribalSpe= speAcquisRepository.save(maquillageTribalSpe);
		
		trousseDuMenteur.setNom("Trousse du menteur");
		trousseDuMenteur.setCategorie("Outil");
		trousseDuMenteur.setClasse(1);
		trousseDuMenteur.setValeur(100);
		trousseDuMenteur.setDomaine(social);
		trousseDuMenteur.setDescription("Faux papiers, photos compromettantes floues, poils de woons,..");
		trousseDuMenteur.setType("Acquis du quotidien");
		SpecialisationAcquis trousseDuMenteurSpe = new SpecialisationAcquis(bluff,trousseDuMenteur,1);
		trousseDuMenteur=acquisRepository.save(trousseDuMenteur);
		trousseDuMenteurSpe=speAcquisRepository.save(trousseDuMenteurSpe);
		
		cachet.setNom("Cachet");
		cachet.setCategorie("Richesse");
		cachet.setClasse(1);
		cachet.setValeur(800);
		cachet.setPrestige(1);
		cachet.setDomaine(arts);
		cachet.setDescription("Recette du dernier spectacle à succès, assez récente pour ne pas avoir eu le temps d'être dépensée.");
		cachet.setType("Richesses"); 
		cachet=acquisRepository.save(cachet);
		
		feuDArtifice.setNom("Feu d'artifice");
		feuDArtifice.setCategorie("Outil");
		feuDArtifice.setClasse(1);
		feuDArtifice.setValeur(100);
		feuDArtifice.setDomaine(arts);
		feuDArtifice.setDescription("10 fusées éclairantes multicolores, du matériel pour faire des effets pyrotechniques, 10 doses de poudre explosive,..");
		feuDArtifice.setType("Outil de classe 1");
		SpecialisationAcquis feuDArtificeSpe = new SpecialisationAcquis(artsDuFeu, feuDArtifice, 1);
		feuDArtifice=acquisRepository.save(feuDArtifice);
		feuDArtificeSpe = speAcquisRepository.save(feuDArtificeSpe);
		
		pomolhPuant.setNom("Pomolh puant");
		pomolhPuant.setCategorie("Armimale");
		pomolhPuant.setClasse(1);
		pomolhPuant.setValeur(1000);
		pomolhPuant.setDomaine(shaan);
		pomolhPuant.setDescription("Le Pomolh émet un nuage de gaz anal qui vient se plaquer sur ses adversaires. L’odeur pestilentielle est insupportable et occasionne une gêne pour toute action tentée. Peuple d'origine : Marais");
		pomolhPuant.setType("Armimale de classe 1");
		pomolhPuant=acquisRepository.save(pomolhPuant);
		
		plantesCuratives.setNom("Plantes curatives");
		plantesCuratives.setCategorie("Artefact");
		plantesCuratives.setClasse(1);
		plantesCuratives.setValeur(100);
		plantesCuratives.setPrestige(2);
		plantesCuratives.setDescription("10 doses");
		plantesCuratives.setDomaine(shaan);
		plantesCuratives.setType("Plantes de classe 1");
		SpecialisationAcquis plantesCurativesSpe = new SpecialisationAcquis(soinsDeLEsprit, plantesCuratives, 1);
		plantesCuratives=acquisRepository.save(plantesCuratives);
		plantesCurativesSpe= speAcquisRepository.save(plantesCurativesSpe);
		
		tuniqueNomoi.setNom("Tunique Nomoi");
		tuniqueNomoi.setCategorie("Protection");
		tuniqueNomoi.setClasse(1);
		tuniqueNomoi.setValeur(300);
		tuniqueNomoi.setProtection("Corps +1");
		tuniqueNomoi.setDomaine(magie);
		tuniqueNomoi.setDescription("Combinaison constituée de fines plaques métalliques cousues dans les drapés d'un tissu épais.");
		tuniqueNomoi.setType("Acquis du quotidien");
		tuniqueNomoi=acquisRepository.save(tuniqueNomoi);
		
		schemeDEnchantementMineur.setNom("Scheme d'enchantement mineur");
		schemeDEnchantementMineur.setCategorie("Artefact");
		schemeDEnchantementMineur.setClasse(1);
		schemeDEnchantementMineur.setValeur(500);
		schemeDEnchantementMineur.setPrestige(2);
		schemeDEnchantementMineur.setDomaine(magie);
		schemeDEnchantementMineur.setDescription("Schème sculpté, gravé, tatoué, peint, ... qui donne un bonus dans la Spécialisation Enchantement.");
		schemeDEnchantementMineur.setType("Schemes de classe 1");
		SpecialisationAcquis schemeDEnchantementMineurSpe = new SpecialisationAcquis(enchantement, schemeDEnchantementMineur,1);
		schemeDEnchantementMineur=acquisRepository.save(schemeDEnchantementMineur);
		schemeDEnchantementMineurSpe=speAcquisRepository.save(schemeDEnchantementMineurSpe);
		
		batonWoon.setNom("Baton Woon");
		batonWoon.setCategorie("Armement");
		batonWoon.setClasse(1);
		batonWoon.setValeur(200);
		batonWoon.setDomaine(rituels);
		batonWoon.setType("Acquis du quotidien");
		SpecialisationAcquis batonWoonSpe1 = new SpecialisationAcquis(armesDeMelee, batonWoon,1);
		SpecialisationAcquis batonWoonSpe2 = new SpecialisationAcquis(intimidation, batonWoon,1);
		batonWoon=acquisRepository.save(batonWoon);
		batonWoonSpe1 = speAcquisRepository.save(batonWoonSpe1);
		batonWoonSpe2 = speAcquisRepository.save(batonWoonSpe2);
		
		grigriDuVegetal.setNom("Grigri du végétal");
		grigriDuVegetal.setCategorie("Artefact");
		grigriDuVegetal.setClasse(1);
		grigriDuVegetal.setValeur(100);
		grigriDuVegetal.setPrestige(2);
		grigriDuVegetal.setDomaine(rituels);
		grigriDuVegetal.setDescription("pendentif à icônes, amulette, livre de culte, corne d’appel à la prière, talisman …");
		grigriDuVegetal.setType("Grigri");
		SpecialisationAcquis grigriDuVegetalSpe = new SpecialisationAcquis(riteDeSavoir, grigriDuVegetal,1);
		grigriDuVegetal=acquisRepository.save(grigriDuVegetal);
		grigriDuVegetalSpe = speAcquisRepository.save(grigriDuVegetalSpe);
		
		longueVue.setNom("Longue vue");
		longueVue.setCategorie("Outil");
		longueVue.setClasse(1);
		longueVue.setValeur(100);
		longueVue.setDomaine(survie);
		longueVue.setType("Outils de classe 1");
		SpecialisationAcquis longueVueSpe = new SpecialisationAcquis(vigilance, longueVue,1);
		longueVue=acquisRepository.save(longueVue);
		longueVueSpe = speAcquisRepository.save(longueVueSpe);
		
		boomerang.setNom("Boomerang");
		boomerang.setCategorie("Armement");
		boomerang.setClasse(1);
		boomerang.setValeur(200);
		boomerang.setDomaine(survie);
		boomerang.setType("Armement");
		SpecialisationAcquis boomerangSpe = new SpecialisationAcquis(armesLancees, boomerang,0);
		boomerang=acquisRepository.save(boomerang);
		boomerangSpe = speAcquisRepository.save(boomerangSpe);
		
		sarbacane.setNom("Sarbacane");
		sarbacane.setCategorie("Armement");
		sarbacane.setClasse(1);
		sarbacane.setValeur(200);
		sarbacane.setDomaine(combat);
		sarbacane.setCapacité("Dards empoisonnés : Si le dard inflige une blessure, on applique les règles de Poison.");
		sarbacane.setType("Armement de classe 1");
		SpecialisationAcquis sarbacaneSpe = new SpecialisationAcquis(armesAProjectiles, sarbacane, 0);
		sarbacane=acquisRepository.save(sarbacane);
		sarbacaneSpe = speAcquisRepository.save(sarbacaneSpe);
		
		bolas.setNom("Bolas");
		bolas.setCategorie("Artefact");
		bolas.setClasse(1);
		bolas.setValeur(200);
		bolas.setDomaine(combat);
		bolas.setCapacité("Capacité Capturer : Si le personnage parvient à infliger une blessure, il peut choisir de ne pas infliger de dégâts pour capturer l’adversaire. La victime prisonnière sera alors considérée comme paralysée tant qu’elle ne s'est pas libérée grâce à un Test de COMBAT + Forcer ou SURVIE + Acrobatie en opposition.");
		bolas.setType("Armement de classe 1");
		SpecialisationAcquis bolasSpe = new SpecialisationAcquis(armesLancees, bolas, 0);
		bolas=acquisRepository.save(bolas);
		bolasSpe = speAcquisRepository.save(bolasSpe);
		
		radar.setNom("Radar");
		radar.setCategorie("Technologie");
		radar.setClasse(1);
		radar.setValeur(1000);
		radar.setPrestige(1);
		radar.setDomaine(necrose);
		radar.setDescription("Dispositif de détection de mouvement aérien qui porte à 10km. Il est livré avec une petite console utilisée pour interpréter les signaux reçus et paramétrer le système de détection.");
		radar.setType("Technologie de classe 1");
		SpecialisationAcquis radarSpe = new SpecialisationAcquis(vigilance,radar,1);
		radar=acquisRepository.save(radar);
		radarSpe = speAcquisRepository.save(radarSpe);
		
		armeAFeu.setNom("Arme à feu");
		armeAFeu.setCategorie("Technologie");
		armeAFeu.setClasse(1);
		armeAFeu.setValeur(1000);
		armeAFeu.setPrestige(1);
		armeAFeu.setDomaine(necrose);
		armeAFeu.setDescription("Tous types de pistolets de petit calibre qui tirent des munitions standard produites dans les Arsenaux des Grandes Familles. Ces armes disposent d'un télémètre (estimateur de distance), d'un objectif pour lunette de corrélation, ainsi que d'une mire laser (point rouge). Leur facilité d'utilisation et de rechargement transforme n'importe quel individu en donneur de mort.");
		armeAFeu.setType("Armes humaine");
		SpecialisationAcquis armeAFeuSpe = new SpecialisationAcquis(armesHumaines,armeAFeu,3);
		armeAFeu=acquisRepository.save(armeAFeu);
		armeAFeuSpe = speAcquisRepository.save(armeAFeuSpe);
		
//-------------------------------------------------------------------------------------------------------------------------
//		Donnees test creation personnage
//-------------------------------------------------------------------------------------------------------------------------	

		
		
		  Joueur theauj = new Joueur(); Personnage theau = new Personnage();
		  MaitreDuJeu baptiste = new MaitreDuJeu(); PersonnageNonJoueur pnj = new
		  PersonnageNonJoueur(); TableDeJeu parapleteam = new TableDeJeu();
		  AlterationEtat aveugle = new AlterationEtat(); BonusPersonnage bonus = new
		  BonusPersonnage(); PouvoirPersonnage briseCodeTheau = new
		  PouvoirPersonnage(); DomainePersonnage rituelTheau = new DomainePersonnage();
		  MotivationPersonnage forteresseTheau = new MotivationPersonnage();
		  AlterationPersonnage aveugleTheau = new AlterationPersonnage();
		  
		  theauj.setPseudo("theau"); theauj.setEmail("coucou@e.fr");
		  theauj.setMotDePasse("mdp");
		  
		  theauj = joueurRepository.save(theauj);
		  
		  baptiste.setEmail("t@e.fr"); baptiste.setMotDePasse("mdp");
		  baptiste.setPseudo("baptou"); baptiste=maitreDuJeuRepository.save(baptiste);
		  
		  pnj.setCreateur(baptiste); pnj.setCastePerso(artistes);
		  pnj.setMetierPerso(prestidigitateur); pnj.setNom("Armand"); pnj.setAge(2);
		  pnj.setAme(0); pnj.setCorps(2); pnj.setEsprit(0); pnj.setTaille(1.25f);
		  pnj.setSexe(null); pnj.setPoids(21f); pnj = (PersonnageNonJoueur)
		  personnageRepository.save(pnj);
		  
		  parapleteam.setNotes("Il y a du gateau et des meufs dans le frigo. Oups");
		  parapleteam.setMaitreDuJeu(baptiste); parapleteam.setTimer(null); parapleteam
		  = tableDeJeuRepository.save(parapleteam);
		  
		  aveugle.setNom("aveuglé"); aveugle.setEffet("aveugle"); aveugle =
		  alterationEtatRepository.save(aveugle);
		  
		  theau.setAge(22); theau.setAme(5); theau.setNom("Theau");
		  theau.setJoueur(theauj); theau.setMetierPerso(prestidigitateur);
		  theau.setParties(parapleteam); theau.setRacePerso(delhions);
		  theau.setCastePerso(artistes); theau.setPeuplePerso(cites); theau =
		  personnageRepository.save(theau);
		  
		  
		  briseCodeTheau.setPersoLie(theau); briseCodeTheau.setPouvoir(brisecode);
		  
		  briseCodeTheau = pouvoirPersonnageRepository.save(briseCodeTheau);
		  
		  rituelTheau.setRangDomaine(5); rituelTheau.setPersoLie(theau);
		  rituelTheau.setDomaineLie(rituels);
		  
		  rituelTheau = domainePersonnageRepository.save(rituelTheau);
		  
		  forteresseTheau.setPersoLie(theau);
		  forteresseTheau.setMotivation(forteresse);
		  
		  forteresseTheau = motivationPersonnageRepository.save(forteresseTheau);
		  
		  bonus.setBonusPerso(1); bonus.setBonusAcquis(1); bonus.setAcquis(lanceClous);
		  bonus.setPersoLie(theau); bonus.setSpecialisation(vigilance);
		  
		  bonus = bonusPersonnageRepository.save(bonus);
		  
		  aveugleTheau.setAlterationEtat(aveugle); aveugleTheau.setPersoLie(theau);
		  aveugleTheau = alterationPersonnageRepository.save(aveugleTheau);
		 
	}

}
