package newTab

class Tab {

    def OpenNewTabAndSwitToHer() {
        js.exec("window.open('about:blank', '', '')")
        List<String> tabs = new ArrayList<>(driver.getWindowHandles())
        driver.switchTo().window(tabs.get(tabs.size() - 1))
    }
}
