Dans ce projet en version "SpringBoot et configurations implicites/automatiques" 

index.html comporte un lien vers
   comptes_jquery_rest_json.html et virement_ajax.html (appels de WS-REST)
   
Le seul démarrage prévu est via la classe boot.BootAufoConfigWithEmbeddedTomcat 
("Spring boot" possible depuis Spring 4)     

Il n'y a presque plus de classe java avec @Configuration
mais à la place on a:

* application.properties (dans src/main/resources)

* @AutoConfiguration


====================

NB: ca fonctionne à peu près (mais c'est améliorable) !!!

