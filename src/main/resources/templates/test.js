{
    "store": [[${store}]],
    "books": [[${store.book}]],
    "book-0": [[${store.book[0]}]],

    [# th:each="book,iter : ${store.book}"]
    [['book-' + ${iter.index}]]: [[${book}]][# th:if="${iter.index} < ${iter.size} - 1"],[/]
    [/]

    [# th:switch="${expensive}"]
        [# th:case="'5'"]good[/]
        [# th:case="'10'"]too expensive[/]
        [# th:case="*"]other[/]
    [/],
    "data": [[${#strings.toString('123')}]]
    "data": [[${#locale.language}]]

    "data": [[${#ctx.variableNames}]]
    "data": [[${#root}]]
}