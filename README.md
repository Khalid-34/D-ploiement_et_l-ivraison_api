# D-ploiement_et_l-ivraison_api

Ouvrire un powerShell via le dossier Spa puis entre la commande:

mvn com.microsoft.azure:azure-webapp-maven-plugin:2.2.3:config 

pour configuer la web app 

ensuite relancer cette commande pour deployer la web app sur azure :

mvn package azure-webapp:deploy

