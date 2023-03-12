# ADVANCED GIT COMMANDS AND WORKFLOW

## cherry pic : prend un commit d'une branche pour le placer sur une autre

```
git checkout bugfix/projet-2292
$ git log
commit a6fc02b787b60551cef11574227b31e933e6d41b (HEAD -> bugfix/projet-2292)
Author: Stephane KERESZTES <stkeresztes-ext@airfrance.fr>
Date:   Mon Aug 29 16:28:04 2022 +0200

    gestion des cumuls 

commit 7def3015ceb242a915d7e5efb4c27c5ee833aae8 (origin/bugfix/projet-2292)
Author: Stephane KERESZTES <stkeresztes-ext@airfrance.fr>
Date:   Fri Aug 26 13:27:48 2022 +0200

    ajout system.out pour debug

commit 1415138c8db5ad35369433f1555a1112e970e716
Author: Stephane KERESZTES <stkeresztes-ext@airfrance.fr>
Date:   Fri Aug 26 11:36:10 2022 +0200


git checkout bugfix/projet-2292-bis
git cherry-pick a6fc02b787b60551cef11574227b31e933e6d41b 


```

## To be completed
  
```
```
