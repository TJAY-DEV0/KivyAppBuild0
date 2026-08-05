from kivy.app import App
from kivy.uix.label import Label


class CounterApp(App):
    def build(self):
        return Label(text="Hello from ksproject!")


def main():
    CounterApp().run()


if __name__ == "__main__":
    main()
