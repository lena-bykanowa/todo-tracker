# Zadanie 4 - Java Przetwarzanie Struktur Danych
#### Zakres: Struktury danych, OOP


## Zadanie "Quiz" :thought_balloon: 

**Cel:**  
Zaprojektuj aplikację typu Quiz (sprawdzanie wiedzy z dowolnego tematu).

   

**Założenia:**  

Quiz składa się z min. 3 pytań, a każde pytanie ma min. 3 odpowiedzi i tylko jedna jest prawidłowa.  
Pytania do quizu są za każdym razem losowane z większej puli (min. 5 pytań, zakodowane w osobnej klasie, np. QuestionPool).

Tematyka pytań dowolna.

Po uruchomieniu programu na konsoli wyświetlane jest pierwsze wylosowane pytanie i program czeka na wprowadzenie z konsoli numeru odpowiedzi (a, b lub c).  

<br>_Przykładowe pytanie:_<br/>

Pytanie nr: 1  
Kategoria: Java SE  
Treść pytania: Wybierz poprawne stwierdzenie dotyczące Tablic w Javie:  
Odpowiedzi:  
a. Posiadają zawsze posortowane elementy.  
**b. Rozmiar tablicy jest stały.**  
c. Tablicę można poszerzyć za pomocą metody expand().
   

Następnie program wyświetla informację, czy udzielono prawidłowej odpowiedzi, a jeśli nie, to jaka jest poprawna odpowiedź.  
Po wyświetleniu wszystkich pytań otrzymujemy informację z końcowym wynikiem.  
   

**Wymagania:**
- aplikacja powinna być napisana obiektowo (klasy np. Quiz, Question, Answer, Category (enum) itd.) - **2 pkt**.
- program powinien korzystać z min. **dwóch** różnych struktur danych (List, Map, Set, Tablica) - **2 pkt**.
- pytania do quizu powinny być losowe i nie powinny się powtarzać (w ramach jednego quizu) - **1 pkt**.

Maksymalną liczbę punktów za zadanie można otrzymać tylko wówczas, jeśli wszystkie powyższe polecenia zostały wykonane.

   

**Dla chętnych** (bez wpływu na ocenę za zadanie):  
- zbiór pytań do quizu jest wczytywany z pliku json.
- na początku quizu wybieramy kategorię i wylosowane pytania są tylko z tej kategorii.
- może być więcej niż jedna prawidłowa odpowiedź na każde pytanie, np:
    - Treść pytania: Wybierz poprawne stwierdzenia dotyczące Tablic w Javie:
    - Odpowiedzi:  
      a. Posiadają zawsze posortowane elementy.  
      **b. Używają indeksów liczbowych do dostępu do poszczególnych elementów.**  
      **c. Rozmiar tablicy jest stały.**  
      d. Tablicę można poszerzyć za pomocą metody expand().  
      **e. W przeciwieństwie do list umożliwiają trzymanie wartości typów prymitywnych.**


## Forma oddania zadania
Utwórz branch o nazwie wg konwencji `4_imieNazwisko`, np. `4_LukaszChrzanowski`  
:exclamation: Pamiętaj, aby nowy branch utworzyć wychodząc z aktualnego brancha `main`.
Wykonaj zadanie na podanym branchu.  
Utwórz Pull Request ze swojego brancha na branch main.  
Dopiero tak zgłoszone zadanie podlega ocenie.


## Punktacja

Do zdobycia jest :five: pkt.  
Zadania oddane po terminie są oceniane na maksymalnie połowę punktów.

#### Powodzenia!

### :clock12: Termin oddania:
## Poniedziałek, 11.04.2022
