Dans ce projet en version "SpringBoot et configurations explicites" 
La partie JSF a été enlevée (car rare sur des projets très récents)

index.html comporte un lien vers
   comptes_jquery_rest_json.html et virement_ajax.html (appels de WS-REST)
   
   
Toute la configuration XML a été supprimée et remplacée par une config java:

plus de META-INF/persistence.xml  mais DomainAndPersistenceConfig.java
plus de WEB-INF/web.xml 
     mais config/web/initializer/MyWebApplicationInitializer.java  
     
En plus du démarrage web classique (dans tomcat) via .war et Run as / run on server
cette application également être démarrée via la méthode main()
de la classe boot.BootWithEmbeddedTomcat ("Spring boot" possible depuis Spring 4)     