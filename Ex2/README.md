# Zadanie 2 - Podstawy programowania Java SE
### Zakres: klasa, obiekt, konstruktor, getter, setter + git 


## Zadanie "Bootcamp" cz.1 :mortar_board:

**Cel:**  
Za pomocą klas w javie chcemy zamodelować prostą aplikację typu „indeks kursanta”. :green_book:  

**Założenia:**  
Rozpoczynamy pracę nad aplikacją dla firmy szkoleniowej (typu infoShare Academy)  :wink:  
Pierwszą funkcjonalnością, na jakiej bardzo zależy naszemu klientowi, będzie możliwość rejestracji ocen, jakie kursanci otrzymali za zadania domowe.  

Jakie informacje zbieramy (utworzymy na ich podstawie klasy z polami):
- zadanie:
  - numer (np. Ex1),
  - treść zadania (krótki opis),
  - maksymalna liczba punktów za zadanie
- kursant:
  - imię,
  - nazwisko,
  - login GitHub
- ocena za zadanie:
  - jakie zadanie (najlepiej link/referencja do obiektu typu zadanie, nie numer zadania),
  - który kursant (najlepiej link/referencja do obiektu typu kursant, nie dane kursanta),
  - liczba zdobytych punktów,
  - uwagi do rozwiązania (krótki feedback).
  

**Wymagania:**  
- utwórz minimum trzy klasy z polami i metodami do ustawiania, i pobierania wartości (gettery i settery), plus klasę typu 'Main' (lub klasę o innej dobrej nazwie z metodą `main()`) do uruchamiania aplikacji,
- użyj odpowiednich typów dla swoich pól w klasach (np. integer dla liczby punktów, a nie string, np. typ Student dla określenia kursanta),
- utwórz minimum dwa obiekty zadań domowych (np. ex1, ex2),
- utwórz minimum dwa obiekty kursantów,
- utwórz minimum dwa obiekty ocen (różni kursanci / różne zadania),
- wszystkie obiekty utwórz w klasie 'Main' z wykorzystaniem odpowiedniego konstruktora,
- wartości pól ustaw za pomocą 'setterów' lub przy pomocy konstruktora,
- na koniec wypisz na konsolę wszystkie oceny, jakie otrzymali kursanci za zadania domowe, przykład:
  ```
  Janek Kowalski za zadanie Ex1 otrzymal 5 pkt.
  Zenek Nowak za zadanie Ex2 otrzymal 3 pkt.
  ```
- przy pobieraniu wartości pól do wypisania na konsolę użyj odpowiednich 'getterów'.

---

## Forma oddania zadania
Zadanie powinno być oddane w formie commitów na oddzielnym branchu o nazwie wg konwencji `nrzadania_ImięNazwisko` (np: `2_LukaszChrzanowski`)

Ponieważ **git** wciąż sprawia najwięcej problemów, przejdźmy razem przez wszystkie kroki, które musisz wykonać.

## :building_construction: 
1. Przejdź w konsoli do miejsca, gdzie masz repozytorium `jjdzr5-homeworks`.
2. Sprawdź, na jakim branchu aktualnie się znajdujesz za pomocą `git status`. 
3. Jeśli jesteś na swoim branchu (`On branch 1_TwojeImięNazwisko`) i masz jakieś `Changes to be committed`, to należy dodać commit, żeby nie utracić swojego kodu przy zmianie brancha!
4. Przejdź na branch `master` za pomocą komendy `git checkout master`. Komunikat na konsoli powinien informować, że zmieniliśmy branch: 
   ```
   Switched to branch 'master'
   Your branch is behind 'origin/main' by 2 commits, and can be fast-forwarded.
       (use "git pull" to update your local branch)
   ```
5. Zgodnie z wyświetloną komendą wykonaj `git pull`, żeby pobrać do swojego lokalnego repozytorium wszystkie zmiany, jakie zaszły na głównym branchu `main` w zdalnym repozytorium `jjdzr5-homeworks` na GitHubie.
6. Po wykonaniu `git pull` w Twoim lokalnym repozytorium powinien zostać dodany folder `Ex2` z nowym zadaniem do wykonania. 
7. Stwórz branch o odpowiedniej nazwie, np.: `2_LukaszChrzanowski` poprzez: `git checkout -b 2_TwojeImięNazwisko`.
8. Upewnij się raz jeszcze, że poprawnie założyłeś/aś nowy branch wpisując `git status`. Tekst w konsoli powinien głosić: `On branch 2_TwojeImięNazwisko`. 
9. Uruchom IntelliJ i utwórz nowy projekt do nowego zadania (np. Bootcamp).  
Jeśli nie wiesz jak to zrobić, to pomoże w tym ta instrukcja: https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html  
:exclamation: Zwróć uwagę, żeby odpowiednio ustawić ścieżkę do nowego projektu (Project location) - musi się on znaleźć w katalogu `Ex2` w repozytorium `jjdzr5-homeworks`. To jest bardzo ważne, bo w przeciwnym razie Twoje rozwiązanie nie trafi w odpowiednie miejsce w zdalnym repo na GitHubie. Tak więc, tworząc projekt pod zadanie, sprawdź dokładnie, czy 'Project location' kończy się taką ścieżką: `(jakieś lokalizacja w komputerze)/jjdzr5-homeworks/Ex2/Bootcamp`.
10. Wykonaj zadanie i commituj wyniki. Aby wykonać commit, najprościej: `git add -A`, a następnie `git commit -m "this is my commit message"`
11. Wyślij zmiany na GitHub'a za pomocą komendy `git push origin 2_TwojeImięNazwisko`. 
12. Twój branch ze wszystkimi commitami powinien znajdować się na GitHub'ie, upewnij się tutaj: https://github.com/infoshareacademy/jjdzr5
-homeworks/branches
13. Chcesz dodać kolejne zmiany? commit i push ... i tak aż do ukończenia zadania :tada:
14. W razie potrzeby — łap mnie na Slacku :calling:


## Punktacja

Do zdobycia jest :five: pkt.
Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania:
## Środa, 16.02.2022
