# 🎓 Application de Gestion des Admis

Cette application web permet de gérer une liste d’admis (étudiants ou employés) en utilisant **Spring Boot**, **Thymeleaf** et une base de données **MySQL**.

## 📌 Objectif

L'application offre une interface simple permettant :
- D’ajouter un admis
- De modifier les informations d’un admis
- De supprimer un admis
- De lister tous les admis

---

## 🚀 Technologies utilisées

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring MVC
- Thymeleaf (template engine)
- MySQL (hébergé sur Aiven)
- Maven

---

## 📁 Structure du projet

# 📦 EmployeApplication
├── 📂 controller → Contrôleurs web (EmployeController.java)

├── 📂 model → Classe Employe (entité)

├── 📂 Repository → Interface JPA : EmployeRepository.java

├── 📂 Service → Interface EmployeService.java

├── 📂 serviceImpl → Implémentation EmployeServiceImpl.java



---

## 📊 Fonctionnalités principales

| Fonction                | Description                                      |
|------------------------|--------------------------------------------------|
| 🔍 Lister               | Afficher tous les admis                         |
| ➕ Ajouter              | Formulaire pour ajouter un nouvel admis         |
| 🖊️ Modifier            | Formulaire pour modifier les données d’un admis |
| ❌ Supprimer            | Supprimer un admis via son ID                   |

---

## 🌐 Endpoints disponibles

| URL                    | Méthode | Vue Thymeleaf         | Action                        |
|------------------------|---------|------------------------|-------------------------------|
| `/Employes`            | GET     | Employes.html          | Lister tous les admis         |
| `/Employes/new`        | GET     | New_Employe.html       | Formulaire de création        |
| `/Employes`            | POST    | -                      | Sauvegarder un nouvel admis   |
| `/Employes/edit/{id}`  | GET     | Edite_Employe.html     | Formulaire d'édition          |
| `/Employes/{id}`       | POST    | -                      | Enregistrer les modifications |
| `/Employes/{id}`       | GET     | -                      | Supprimer un admis par ID     |

---

## 🧠 Structure des données

### Entité `Employes`

```java
@Entity
@Table(name = "etudiants")
public class Employes {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
```
## Base de données : MySQL
Nom de la base : empl
Table : etudiants

### ⚙️ Configuration application.properties
```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://mysql-xxxxx.aivencloud.com:18942/empl?ssl-mode=REQUIRED
spring.datasource.username=avnadmin
spring.datasource.password=AVNS_xxxxxxxxxxxxxx
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
##  Compiler et lancer l'application
```
./mvnw spring-boot:run
```
## Accéder à l’interface
```
http://localhost:8080/Employes
```

### 🖼️ Vue utilisateur
- Employes.html → Liste des admis avec boutons modifier/supprimer
- New_Employe.html → Formulaire de création
- Edite_Employe.html → Formulaire de modification

### ✅ Exemple d’insertion initiale (optionnelle)
```
Employes emp1 = new Employes("Mombouli", "Trinité", "trinitemombouli@gmail.com");
empr.save(emp1);
```

### 🛠️ Dépendances Maven principales (pom.xml)
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

```
## 👨‍💻 Auteur

Développé par **MOMBOULI Trinité**  
📧 [trinitemombouli@gmail.com](mailto:trinitemombouli@gmail.com)

### /!\
La base de données Mysql n'est plus accessible (elle avait été déployer sur un cloud gratuit pendant un certains temps)
