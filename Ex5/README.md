# Zadanie 5 - Spring & Thymeleaf
#### Zakres: Spring Boot, Thymeleaf, HTTP, HTML, Bootstrap

### Zadanie ToDoList cz.1 :scroll:

Napisz program typu "Lista ToDo".  
Główną funkcją aplikacji jest wyświetlanie listy zadań do wykonania.

Użytkownik może dodawać kolejne zadania za pomocą odpowiedniego formularza, zawierającego następujące pola:
- **opis** - co trzeba zrobić,
- **kategoria** - do wyboru z rozwijanej listy (min. 2 pozycje, np. praca/dom),
- **priorytet** - od 1 (najwyższy) do 5 (najniższy) - walidacja (nie można wpisać liczby spoza zakresu),
- **termin** - można wpisać tylko datę z przyszłości.

Po wprowadzeniu nowego zadania jest ono zapisywane w pamięci (opcja dla chętnych: zapisywanie również do pliku json), a następnie wyświetlana jest lista z wszystkimi zadaniami do wykonania (każdy element listy zawiera opis, kategorię, priorytet i termin).

Na stronie ze wszystkimi zadaniami powinien się też znaleźć przycisk **| dodaj nowe zadanie |**, dzięki któremu szybko wyświetlimy formularz do wprowadzenia nowego zadania.

Po uruchomieniu aplikacji stroną główną jest lista ze wszystkimi zadaniami (pusta, jeśli jeszcze nie ma żadnych zadań, wówczas tylko przycisk dodawania nowego zadania).


##### Wymagania:
   - Przy tworzeniu obu widoków wykorzystaj integrację warstwy frontendu z backendem za pomocą wyrażeń dostępnych w Thymeleafie.
   - Widoki powinny być estetyczne i czytelne (warto wykorzystać np. bibliotekę bootstrap).
   - Po stronie backendu dodaj odpowiednie kontrolery i endpointy.
   - Aplikacja powinna być napisana obiektowo, zgodnie ze wzorcem **MVC** oraz zgodnie z zasadami **clean-code**. 
  
<br/>Maksymalną liczbę punktów za zadanie można otrzymać tylko wówczas, jeśli wszystkie powyższe polecenia zostały wykonane.  


## Forma oddania zadania
Utwórz branch o nazwie wg konwencji `5_imieNazwisko`, np. `5_LukaszChrzanowski`  
:exclamation: Pamiętaj, aby nowy branch, utworzyć wychodząc z aktualnego brancha `main`.
Wykonaj zadanie na podanym branchu.  
Utwórz Pull Request ze swojego brancha na branch main.  
Dopiero tak zgłoszone zadanie podlega ocenie.


## Punktacja

Do zdobycia jest :five:  pkt. Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania: Niedziela, 23.05.2022
