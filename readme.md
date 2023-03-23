# ADVANCED GIT COMMANDS AND WORKFLOW

## cherry pick : get a commit of any branch to put it on current branch

**single commit**
```
git cherry-pick <commit-ref> 
```
```
cherry pick range of commit
$ git cherry-pick <commit-ref>..<commit-ref>”
```


## add/remove tag
add tag on current branch and last commit then push on remote
```
git tag -a v1.0.0 -m "Releasing version v1.0.0"
```
```
git push origin v1.0.0 
```
add tag on any commit
```
git tag v0.0.0 6b76e7ebc04933c411343a5044a5e621b51baaba
```
```
git push origin v0.0.0
```
remove tag locally
```
git tag -d v1.0.0
```
remove tag on a remote branch
```
git push origin --delete v1.0.0
```

