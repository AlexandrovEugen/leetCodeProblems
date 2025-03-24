package com.eval.year2025.medium.puzzle2115;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();




    /*
    Input: recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour","corn"]
    Output: ["bread"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    */
    @Test
    void example1(){
        String[] recipes = {"bread"};
        List<List<String>> ingredients = List.of(List.of("yeast", "flour"));
        String[] supplies = {"yeast","flour","corn"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).containsExactlyInAnyOrder("bread");
    }

    /*
    Input: recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"]
    Output: ["bread","sandwich"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
    */
    @Test
    void example2(){
        String[] recipes = {"bread","sandwich"};
        List<List<String>> ingredients = List.of(List.of("yeast","flour"),List.of("bread","meat"));
        String[] supplies = {"yeast","flour","meat"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).containsExactlyInAnyOrder("bread", "sandwich");
    }

    /*
    Input: recipes = ["bread","sandwich","burger"], ingredients = [["yeast","flour"],["bread","meat"],["sandwich","meat","bread"]], supplies = ["yeast","flour","meat"]
    Output: ["bread","sandwich","burger"]
    Explanation:
    We can create "bread" since we have the ingredients "yeast" and "flour".
    We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
    We can create "burger" since we have the ingredient "meat" and can create the ingredients "bread" and "sandwich".
    */
    @Test
    void example3(){
        String[] recipes = {"bread","sandwich","burger"};
        List<List<String>> ingredients = List.of(List.of("yeast","flour"),List.of("bread","meat"),List.of("sandwich","meat","bread"));
        String[] supplies = {"yeast","flour","meat"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).containsExactlyInAnyOrder("bread","sandwich","burger");
    }

    @Test
    void example4(){
        String[] recipes = {"ju","fzjnm","x","e","zpmcz","h","q"};
        List<List<String>> ingredients = List.of(List.of("d"),List.of("hveml","f","cpivl"),List.of("cpivl","zpmcz","h","e","fzjnm","ju"),List.of("cpivl","hveml","zpmcz","ju","h"),List.of("h","fzjnm","e","q","x"),List.of("d","hveml","cpivl","q","zpmcz","ju","e","x"),List.of("f","hveml","cpivl"));
        String[] supplies = {"f","hveml","cpivl","d"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).containsExactlyInAnyOrder("ju","fzjnm","q");
    }

    @Test
    void example5(){
        String[] recipes = {"xevvq","izcad","p","we","bxgnm","vpio","i","hjvu","igi","anp","tokfq","z","kwdmb","g","qb","q","b","hthy"
        };
        List<List<String>> ingredients = List.of(List.of("wbjr"),List.of("otr","fzr","g"),List.of("fzr","wi","otr","xgp","wbjr","igi","b"),List.of("fzr","xgp","wi","otr","tokfq","izcad","igi","xevvq","i","anp"),List.of("wi","xgp","wbjr"),List.of("wbjr","bxgnm","i","b","hjvu","izcad","igi","z","g"),List.of("xgp","otr","wbjr"),List.of("wbjr","otr"),List.of("wbjr","otr","fzr","wi","xgp","hjvu","tokfq","z","kwdmb"),List.of("xgp","wi","wbjr","bxgnm","izcad","p","xevvq"),List.of("bxgnm"),List.of("wi","fzr","otr","wbjr"),List.of("wbjr","wi","fzr","xgp","otr","g","b","p"),List.of("otr","fzr","xgp","wbjr"),List.of("xgp","wbjr","q","vpio","tokfq","we"),List.of("wbjr","wi","xgp","we"),List.of("wbjr"),List.of("wi"));
        String[] supplies = {"wi","otr","wbjr","fzr","xgp"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).containsExactlyInAnyOrder("xevvq","izcad","bxgnm","i","hjvu","tokfq","z","g","b","hthy");
    }

    @Test
    void example6(){
        String[] recipes = {"bread"};
        List<List<String>> ingredients = List.of(List.of("yeast", "flour"));
        String[] supplies = {"yeast"};

        List<String> allRecipes = solution.findAllRecipes(recipes, ingredients, supplies);

        assertThat(allRecipes).isEmpty();
    }





}