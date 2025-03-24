package com.eval.year2025.medium.puzzle2115;

import java.util.*;

class Solution {

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Boolean> canCook = new HashMap<>();
        for (String supply : supplies) {
            canCook.put(supply, true);
        }
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < recipes.length; i++) {
            map.put(recipes[i], ingredients.get(i));
        }

        List<String> result = new ArrayList<>();
        for (String recipe : recipes) {
            if (dfs(recipe, map, canCook)) {
                result.add(recipe);
            }
        }
        return result;
    }

    private boolean dfs(String recipe, Map<String, List<String>> map, Map<String, Boolean> canCook) {
        if (canCook.containsKey(recipe)) {
            return canCook.get(recipe);
        }

        canCook.put(recipe, false);

        List<String> ingredients = map.getOrDefault(recipe, Collections.emptyList());
        if (ingredients.isEmpty()) {
            return false;
        }
        for (String nei : ingredients) {
            if (!dfs(nei, map, canCook)) {
                return false;
            }
        }
        canCook.put(recipe, true);
        return canCook.get(recipe);
    }


    @Deprecated
    public List<String> findAllRecipesNotWorking(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        final List<String> res = new ArrayList<>();

        final Set<String> suppliesSet = new HashSet<>(Arrays.asList(supplies));
        final Map<String, Set<String>> remaining = new HashMap<>();

        for (int i = 0; i < ingredients.size(); i++) {
            boolean haveAll = true;
            for (int j = 0; j < ingredients.get(i).size(); j++) {
                haveAll &= suppliesSet.contains(ingredients.get(i).get(j));
            }
            if (haveAll) {
                res.add(recipes[i]);
                suppliesSet.add(recipes[i]);
            } else {
                remaining.put(recipes[i], new HashSet<>(ingredients.get(i)));
            }
        }
        if (!remaining.isEmpty()) {
            for (Map.Entry<String, Set<String>> entry : remaining.entrySet()) {
                boolean haveAll = true;
                for (String s : entry.getValue()) {
                    haveAll &= suppliesSet.contains(s);
                }
                if (haveAll) {
                    res.add(entry.getKey());
                }
            }
        }

        return res;
    }
}
